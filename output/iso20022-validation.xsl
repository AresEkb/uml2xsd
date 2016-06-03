<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fn="http://www.w3.org/2005/xpath-functions"
                xmlns="urn:iso20022:validation-result"
                exclude-result-prefixes="#all">

  <xsl:output indent="yes"/>

  <xsl:variable name="elementNames" as="item()*" />

  <xsl:template match="/">
    <validationResult>
      <xsl:apply-templates />
    </validationResult>
  </xsl:template>
  
  <xsl:template match="@*|node()">
    <xsl:apply-templates />
  </xsl:template>
  
  <xsl:template name="genPath">
    <xsl:param name="prevPath" />
    <xsl:variable name="currPath" select="concat('/',name(),'[',count(preceding-sibling::*[name() = name(current())])+1,']',$prevPath)" />
    <xsl:for-each select="parent::*">
      <xsl:call-template name="genPath">
        <xsl:with-param name="prevPath" select="$currPath" />
      </xsl:call-template>
    </xsl:for-each>
    <xsl:if test="not(parent::*)">
      <xsl:value-of select="$currPath" />      
    </xsl:if>
  </xsl:template>

  <xsl:template name="genBusinessPath">
    <xsl:param name="elementNames" as="item()*" />
    <xsl:param name="path" />
    <xsl:param name="showSep" select="fn:false()" />
    <xsl:variable name="currentPath" select="fn:substring-before(fn:concat($path, '/'), '/')" />
    <xsl:variable name="restPath" select="fn:substring-after($path, '/')" />
    <xsl:variable name="currentElement" select="$elementNames[@path=fn:substring-before($currentPath, '[')]" as="item()*" />
    <xsl:variable name="name" select="$currentElement/@name" />
    <xsl:variable name="showCurrent" select="fn:string-length($name) > 0" />
    <xsl:if test="$showCurrent">
      <xsl:if test="$showSep">
        <xsl:text> -> </xsl:text>
      </xsl:if>
      <xsl:value-of select="$name" />
      <xsl:text> [</xsl:text>
      <xsl:value-of select="fn:substring-after($currentPath, '[')" />
    </xsl:if>
    <xsl:if test="$restPath">
      <xsl:call-template name="genBusinessPath">
        <xsl:with-param name="elementNames" select="$currentElement/*" />
        <xsl:with-param name="path" select="$restPath" />
        <xsl:with-param name="showSep" select="$showSep or $showCurrent" />
      </xsl:call-template>
    </xsl:if>
  </xsl:template>
  
  <xsl:template name="validate">
    <xsl:param name="code" />
    <xsl:param name="isValid" />
    <xsl:param name="definition" />
    <xsl:param name="ocl" />
    <xsl:param name="error" />
    <xsl:param name="valid" />
    <xsl:variable name="path"><xsl:call-template name="genPath"/></xsl:variable>
    <xsl:variable name="businessPath">
      <xsl:call-template name="genBusinessPath">
        <xsl:with-param name="elementNames" select="$elementNames/node()" />
        <xsl:with-param name="path" select="fn:substring-after($path, '/')" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:choose>
      <xsl:when test="$isValid">
        <valid>
          <ruleName><xsl:value-of select="$code" /></ruleName>
          <element><xsl:value-of select="$path" /></element>
          <businessElement><xsl:value-of select="$businessPath" /></businessElement>
          <definition><xsl:value-of select="$definition" /></definition>
          <ocl><xsl:value-of select="$ocl" /></ocl>
          <message><xsl:value-of select="$valid" /></message>
        </valid>
      </xsl:when>
      <xsl:otherwise>
        <error>
          <ruleName><xsl:value-of select="$code" /></ruleName>
          <element><xsl:value-of select="$path" /></element>
          <businessElement><xsl:value-of select="$businessPath" /></businessElement>
          <definition><xsl:value-of select="$definition" /></definition>
          <ocl><xsl:value-of select="$ocl" /></ocl>
          <message><xsl:value-of select="$error" /></message>
        </error>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>

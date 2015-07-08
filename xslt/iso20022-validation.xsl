<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fn="http://www.w3.org/2005/xpath-functions"
                xmlns="urn:iso20022:validation-result"
                exclude-result-prefixes="#all">

    <xsl:output indent="yes"/>
    
    <xsl:template match="/">
        <validationResult>
            <xsl:apply-templates />
        </validationResult>
    </xsl:template>

    <xsl:template name="genPath">
        <xsl:param name="prevPath"/>
        <xsl:variable name="currPath" select="concat('/',name(),'[',count(preceding-sibling::*[name() = name(current())])+1,']',$prevPath)"/>
        <xsl:for-each select="parent::*">
            <xsl:call-template name="genPath">
                <xsl:with-param name="prevPath" select="$currPath"/>
            </xsl:call-template>
        </xsl:for-each>
        <xsl:if test="not(parent::*)">
            <xsl:value-of select="$currPath"/>      
        </xsl:if>
    </xsl:template>
        
    <xsl:template match="@*|node()">
        <xsl:apply-templates />
    </xsl:template>
    
</xsl:stylesheet>

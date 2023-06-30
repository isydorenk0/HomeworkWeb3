<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="text" omit-xml-declaration="yes" indent="no"/>

    <xsl:template match="/Paper">
        <xsl:text>Title | Type | Frequency | Color | Gloss | Pages | Index</xsl:text>
        <xsl:value-of select="'&#13;'" />
        <xsl:apply-templates select="*" />
    </xsl:template>

    <xsl:template match="periodical">
        <xsl:value-of select="concat(title,' | '
                    ,types/type
                    ,' | '
                    ,frequency
                    ,' | '
                    ,chars/isColor
                    ,' | '
                    ,chars/isGloss
                    ,' | '
                    ,chars/pages
                    ,' | '
                    ,chars/index
                    ,'&#13;')"/>
    </xsl:template>

</xsl:stylesheet>
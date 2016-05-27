<!DOCTYPE html>
<html>
<head>
  <#include "../../common.ftl">
</head>
<body>
  <h1>Hello ${name?html}</h1>
  
  <#-- FreeMarkerタグサンプル -->
  
  <#include "../include/sample-include.ftl">
  
  <#if name != "World">
    &lt;パラメータ指定時に表示&gt;
  </#if>
  
</body>
</html>
<!DOCTYPE html>
<html>
<head>
  <link href="/lib/css/bootstrap.min.css" rel="stylesheet">
  <link href="/css/common.css" rel="stylesheet">
  <script type="text/javascript" src="/lib/js/jquery-1.12.4.min.js"></script>
  <script src="/lib/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="/js/sample/sample.js"></script>
</head>
<body>
<#include "../header.ftl">

<div class="container">
  <div class="page-header">
    <h1>Hello ${name?html}</h1>
  </div>

  <p class="lead">
  <#-- 他のFTLファイルをインクルード -->
    <#include "sample-include.ftl">

  <#-- IF文 -->
    <#if name != "World">
      &lt;パラメータ指定あり&gt;
    </#if>
  </p>

  <p>
    <input type="button" class="btn btn-primary" value="primary"/>
    <input type="button" class="btn btn-success" value="success"/>
    <input type="button" class="btn btn-info" value="info"/>
    <input type="button" class="btn btn-warning" value="warning"/>
    <input type="button" class="btn btn-danger" value="danger"/>
  </p>
</div>


<#include "../footer.ftl">
</body>
</html>
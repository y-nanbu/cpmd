<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
  <form id="login-form" name="loginForm" action="/login" method="post">
    <dl>
      <dt>
        <label for="user-id">ユーザID</label>
      </dt>
      <dd>
        <input type="text" id="user-id" name="userId">
      </dd>
      <dt>
        <label for="password">パスワード</label>
      </dt>
      <dd>
        <input type="text" id="password" name="pass">
      </dd>
    </dl>
    <input type="submit" id="execute" value="ログイン">
  </form>
  
</body>
</html>
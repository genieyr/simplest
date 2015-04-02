<!DOCTYPE html>
<html lang="en">;
<head>
    <meta charset="UTF-8">
    <#--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->
    <title>Form list</title>
</head>

<#--<#assign air = model/>-->
<body>
${model}
  <form method="POST" action="/rest/free/form">
    <p>Your id:</p>
     <input type="number" name="id" min="1" max="11"">
    <p>Your name:</p>
    <input type="text" name="name" size=60>
    <p><input type="submit" value="Submit">
  </form>
</body>
</html>

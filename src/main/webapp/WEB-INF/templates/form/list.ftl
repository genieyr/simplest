<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<#--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->
    <title>Form list</title>
</head>

<#--<#assign air = model/>-->
<body>
${model}
<form method="POST" action="/rest/free/form">
    <fieldset>
        <legend>Form :)</legend>
        <label> Your id:<br>
            <input type="number" name="id" min="1" max="11" required>
        </label>
        <p><label for="myName"> Your name:</label><br>
            <input type="text" name="name" size=50 id="myName">
        </p>
        <input type="submit" value="Submit">
    </fieldset>
</form>
</body>
</html>

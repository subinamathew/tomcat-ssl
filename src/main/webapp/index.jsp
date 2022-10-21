<h1>Api</h1>

<p>
    It is now
    <%= new java.util.Date() %>
</p>
<p>
    You are coming from
    <%= request.getRemoteAddr() %>
</p>

<li>id: <span id="_id"></span></li>
<li>name: <span id="_name"></span></li>

<script language="JavaScript">
    var ajax = new XMLHttpRequest();
    ajax.onload = functionName;
    ajax.onerror = errorFunctionName;
    ajax.open("GET", "/api/hello", true);
    ajax.send();

    function functionName() {
        if (this.status == 200) {
            var json = JSON.parse(this.responseText);
            var _id = json.id;
            var _name = json.name;
            document.getElementById("_id").innerHTML = _id;
            document.getElementById("_name").innerHTML = _name;
        }
    }
    function errorFunctionName(e) {
        console.log(this);
        console.error(e);
    }
</script>

<form action="<%= request.getContextPath() %>/hello" method="post">
    Name: <input type="text" name="name">
    <br>
    <input type="submit" value="register">
</form>
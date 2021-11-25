<!DOCTYPE HTML>  
<html>  
    <body>  
        <form method="post">  
    First Name  
            <input type="text" name="fname"/>  
            <input oninput="this.value = this.value.toUpperCase()" />
    Last Name  
            <input type="text" name="lname"/>  
        
        <script>
        function upperCaseF(a){
    setTimeout(function(){
        a.value = a.value.toUpperCase();
    }, 1);
}
</script>
</form>  
    </body>  
</html>
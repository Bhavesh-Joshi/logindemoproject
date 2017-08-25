<html>
    <head>
        <style>
            #form{
                border: #000;
                border-radius: 10px;
                margin: 50 50 50 500;
                padding: 0 0 10 00;
                background-color: #000;
                width: 350px;
                heigth: 100px;
                text-align: center;
                color: #fff;
            }
        </style>
        <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        </link>
        <title>Authentication</title>
    </head>
    <body style="background:#000">
        <div class="well" id="form">
            <img style="padding-bottom:80;" src="https://t1.rbxcdn.com/223c902b9c7d8604c35599e5badd121e" width="100" heigth="100">
            <form action="auth" method='post'>
                Username: <input style="color:#000" type="text" name="username" placeholder="Enter Username here" required><br><br>    
                Password: <input style="color:#000" type="password" name="password" placeholder="Enter Password here" required><br><br>
                <input class="btn btn-default btn-primary" type="submit" value="LogIN"></button>
            </form>          
        </div>
    </body>
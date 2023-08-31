        <html><head>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <titlle>WElcome Page</titlle>
            </head>
            <body><!-- comment -->
                <form action="login" method="get">
                    
                    <h2>Hello<%=request.getParameter("name")%>!</h2>
                
                </form>
                    
                     <a href ='../index.html' >
            <button>Home</button>
            </a>
                
                
                
            </body>
        </html>
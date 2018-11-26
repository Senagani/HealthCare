<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>


<style>
#wrap	{
	width: 9%; /* Spans the width of the page */
	height: 100%; 
	margin: 0; /* Ensures there is no space between sides of the screen and the menu */
	z-index: 10; /* Makes sure that your menu remains on top of other page elements */
	position: relative; 
	}
	.navbar	{
	height: auto;
        padding:0;
	margin: 0;
	position: absolute; /* Ensures that the menu doesn’t affect other elements */

	}
	.navbar li 	{
		
			height: auto;
			width: 90px;  /* Each menu item is 150px wide */
			float: left;  /* This lines up the menu items horizontally */
			text-align: left;  /* All text is placed in the center of the box */
			list-style: none;  /* Removes the default styling (bullets) for the list */
			font: normal bold 12px/1.2em Arial, Verdana, Helvetica;  
			padding: 0;
			margin: 20;
	
                        }
.navbar a	{							
		padding: 8px 0;  /* Adds a padding on the top and bottom so the text appears centered vertically */
	
		text-decoration: none;  /* Removes the default hyperlink styling. */
		color: white; /* Text color is white */
		display: block;
		}
		 .navbar li:hover, a:hover {} 
		 .navbar li ol 	{
		display: none;  /* Hides the drop-down menu */
		height: 6px;									
		margin: 0; /* Aligns drop-down box underneath the menu item */
		padding: 0; /* Aligns drop-down box underneath the menu item */	
text-align: left;		
		}				

.navbar li:hover ol 	{
                        display: block; /* Displays the drop-down box when the menu item is hovered over */
                        }
						
						 .navbar li ol li a 	{
						 height: 2px;
                         }
</style>
<body bgcolor="#454545">
<div id="wrap">
		  <ol class="navbar">
		      <li><a href="Dashboard.form">DASH BOARD</a>       
			 </li>  
			 <li><a href="#">USER</a>
				<ol>
				   <li><a href="newuser.form">ADD USER</a></li>
				   <li><a href="user.form">ALL USER</a></li>
				   <li><a href="download.form">DOWNLOAD</a></li>
				</ol>         
			 </li>
			 <li><a href="#">PAYMENT</a>
				<ol>
				   <li><a href="pay.form" >PAY</a></li>
				   <li><a href="details.form">RECEIVE</a></li>
				   <li><a href="details.form">SUMMARY</a></li>
				</ol>         
			 </li>
			 <li><a href="#">IDENTIFICATION</a>
				<ol>
				   <li><a href="upload.form">UPLOAD PROOF</a></li>
				   <li><a href="show.form">CHECKING</a></li>
				</ol>         
			 </li>
		  </ol>
</div>
</body>
 

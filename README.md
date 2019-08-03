# Restaurant

<h1>Intro</h1>
This just a simple website I'm working on to demonstrate what I can do. The example used here is a simple restaurant with<br>
different levels of authority - members, admins and a@admin. A member is a client, and an admin is a staff member. <br>
Members can do the following:<br>
<ul>
	<li>Look at the menu</li>
	<li>Place an order for delivery</li>
	<li>Place an order to be picked up</li>
	<li>View their profile</li>
	<li>Change credentials in their profile (not their email address)</li>
</ul>
Admins can do the following:
<ul>
	<li>Change another user's credentials (not their email address)</li>
	<li>Place an order to be picked up</li>
	<li>Place an order to be delivered</li>
	<li>Delete an order that was placed</li>
	<li>Change price of specific menu items (employee discount)</li>
	<li>Cash a diner out</li>
</ul>
a@admin can do the following:
<ul>
	<li>Everything an admin can</li>
	<li>Create a new account - member or admin</li>
	<li>Add/remove records of members</li>
	<li>Add/remove/update items in a menu</li>
	<li>Change price of menu items permanently</li>
</ul>

<h1>Setup</h1>
Here's what you'll need to run this - 
<ol>
	<li>Eclipse JEE 2018-12 or later</li>
	<li>Apache Tomcat server (v8.0 or later)</li>
	<li>XAMPP (for database)</li>
	<li>mysql connector .jar file</li>
	<li>Python</li>
	<li>Selenium</li>
	<li>an account on TextFree.us</li>
</ol>

<h2>Eclipse IDE</h2>
Go to <a href='https://www.eclipse.org/downloads/packages/'>this link</a> and look for the appropriate version of <i>Eclipse IDE for Enterprise Java Developers</i>. Click on the Download button on the next page. I have the 64-bit version for Windows.<br>

<h2>Apache Tomcat Server</h2>
Go to <a href='https://tomcat.apache.org/download-90.cgi'>this link</a> and look for the appropriate version under the <i>9.0.22</i> heading in the <i>Core</i> subsection.

<h2>XAMPP</h2>
Head over to <a href='https://www.apachefriends.org/download.html'>this link</a> and scroll through to find the right version for your OS. You'll need this program for the MySQL database it comes with.

<h2>MySQL connector file</h2>
<a href='https://github.com/imadkalboneh/Restaurant/blob/master/WebContent/WEB-INF/lib/mysql-connector-java-5.1.38-bin.jar'>Click here</a> to download the .jar file. Alternatively, this can be found in the WebContent/WEB-INF/lib/ folder in this repository. <br><br>

Once installed, you'll need to run MySQL. To do so, launch it to open up a panel. Click on the <i>Start</i> button that lines up with <i>MySQL</i>, then click on <i>Shell</i> on the right side. Once the colsole opens up, type this command to use MySQL as root.<br><br>
<i>mysql -u root</i><br><br>

NOTE: The name used here is MariaDb but it works exactly the same otherwise. <br><br>

To setup all the tables as I have them, open up the <i>Demo1 plans.txt</i> file, and copy/paste all the commands you see there in the <i>db setup</i> section.
<h2>Python</h2>
I've used version 3.5.7 to write the script used here in the WebContent/refs folder. If it works in a later version you've already installed, cheers! If not, go to <a href='https://www.python.org/downloads/'>this link</a> and look for v3.5.7 and follow the installation process. <br><br>NOTE: add python to your environment variables. It'll allow you to use the <i>python</i> command in your command line!

<h2>Selenium</h2>
All you need here is a command line terminal, and you need to be an admin. Run the following commands: <br>
<ol>
	<li>You'll first need to install <i>python pip</i>. Ignore this step if you already have it installed.<br>
	<i>python get-pip.py</i></li><br>
	<li>Now that you definitely have <i>pip</i>, download selenium<br>
	<i>pip install selenium</i></li>
</ol>


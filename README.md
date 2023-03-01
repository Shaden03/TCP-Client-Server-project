# TCP Client-Server project <a name="TOP"></a>

<img width="1051" alt="Screenshot 1444-08-07 at 11 04 31 PM" src="https://user-images.githubusercontent.com/116809090/221671221-3f44555e-eb9c-4e29-9c2f-2d3d9e2a826a.png">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

 <br>
 <details><summary> <p4> Table of content </p4> </summary>
           <p> 1.Aim of the project</p>
           <p> 2.Why Java!</p> 
           <p> 3.Java libraries</p> 
           <p> 4.Steps for TCP socket programming connection</p>
           <p> 5.Steps for setting up the network</p>
           <p> 6.Application outputs </p>
           <p> 7.Developers Team </p> </details>
 
<br>
<br>

> ## Aim of the project 
**The aim of this project is to develop a simple TCP-based client server application**
- TCP client/server connection will communicate over the network and exchange data<br>
- The server will start in passive mode listening for a transmission from the client<br>
- The client will then start and contact the server (on a given IP address and port number)<br>
- The user of the client application types in a word that will be sent to the server;<br>
-  the server will send back a copy of the word.<br>
- If the server is down then the client must display an error message.<br>
- If server is running, then the client will ask the user to select one of the options:<br>
1) open mode<br>
2) secure mode<br>
3) quit application<br>
In the open mode, the word is sent to the server in clear text. On the other hand, in secure mode, the word is encrypted using a shared encryption key.<br>
<br>
<br>
> ## Project Enviroment
**why we chose to program in Java Language!**
<br>
<br>
*There are several reasons why we though Java was the suitable choice to use it as programming language:*
<br>
<br>
1.Java is a platform independent language, which means that there same code run on any platform such as "Windows, Mac, or linux" without modification, which can make java ideal for our project that need to run on different platform.<br> <br>
2.Java is an object-oriented programming language, which provides a well- structured way to model real-world problems, which make it easier to develop complex applications that are easy to maintain and extend.<br> <br>
3.The main reason why we chose Java as a programming language is because it has a large community of developers, which made it easy for us to find resources and support for developing this project, java also has plenty of libraries and frameworks, which helped us to speed up the development process.
<br>
<br>
**We needed to import some of java libraries for the following purposes:**
<br>
- [java.io.*] The input/output functionality needed to read and write data to and from the socket is provided by this library.<br>
- [java.net.*] The classes and interfaces required to operate with network communication, including sockets, are provided by this library.<br> 
- [java.util.Scanner] This library offers a practical method of reading user input.<br>
- [javax.crypto.* ] The classes and interfaces required for data encryption and decryption are provided by this library.<br>
- [java.security.*] This library offers classes and interfaces for security- related functions, such as support for creating and managing encryption and decryption keys.
<br><br>


> ## Steps for TCP socket programming connection

1- The socket for the client will be created from socket class in java.net:<br>
<img width="296" alt="Screenshot 1444-08-09 at 7 54 04 PM" src="https://user-images.githubusercontent.com/116809090/222208095-3da88263-04e8-45fa-9d31-3bd810c5c9c0.png"> <br>
2- pass the server's id address and port number in client class:<br>
<img width="344" alt="Screenshot 1444-08-09 at 7 55 29 PM" src="https://user-images.githubusercontent.com/116809090/222208395-6c61895c-d164-4937-a39a-085814a8883f.png"><br>

3- The Socket for the server will be created using serverSocket from java.net and pass the port number as an argument:<br>
<img width="532" alt="Screenshot 1444-08-09 at 7 55 45 PM" src="https://user-images.githubusercontent.com/116809090/222208447-bb4bcacd-e8bc-4e2e-a5e7-6554a1071599.png"><br>


**4- accept connection :**
- on server side [accept()] used from the ServerSocket class so the incoming client connection be accepted, it will return socket object that will be used for communication with the client<br>

<img width="497" alt="Screenshot 1444-08-09 at 7 56 05 PM" src="https://user-images.githubusercontent.com/116809090/222208519-f5ec10a5-079d-4e86-9087-7931d89188b3.png"><br>


5- these are methods of the socket the client will use to get the output and input streams of the socket, the server will also use it to recieve and send to the client<br>
<img width="540" alt="Screenshot 1444-08-09 at 7 56 25 PM" src="https://user-images.githubusercontent.com/116809090/222208606-c5a5e9c2-4aa5-44ec-b540-6011385cecac.png"><br>

6- as It mentioned in the step 4 the server will use the streams to receive and send data to the client using [Write()] and [read()] of the outputstream( ) and inputstream( ) "used for communication between client and server"<br>
<img width="599" alt="Screenshot 1444-08-09 at 8 01 35 PM" src="https://user-images.githubusercontent.com/116809090/222209890-9077a463-b0fc-4d78-8e40-0d901ecb9cde.png"><br>

7- close the Socket when the communication is done by using Close()<br>
<img width="436" alt="Screenshot 1444-08-09 at 8 02 05 PM" src="https://user-images.githubusercontent.com/116809090/222209992-2eaa8c05-72f1-47d3-8b12-4e1d7d726716.png"><br>

8- Used [I0Exception] and [uknownHostException] for Handling any error<br>
<img width="488" alt="Screenshot 1444-08-09 at 8 02 22 PM" src="https://user-images.githubusercontent.com/116809090/222210067-0ef5cc45-c34c-4f7a-a1b7-e2640e1fc08a.png"><br>
<br>
> ## Steps for setting up the network

1. Connect Mac(Server) device to a network<br>
2. Copy IP address on Network (Server)  , so that both ( Server)and (client ) have the same network.<br>
3. Make sure that you Connect the  [client] with the same network as [Server].<br>
4. Paste the IP address that you copied from Server device [Mac] in the client [Window]code so you can activate the connection between the two devices , Successfully the connection had done.<br>
<br>
<br>

> ## Application outputs
In the second option which is the [Secure mode] the client will send a message <br>
<img width="287" alt="Screenshot 1444-08-09 at 8 19 09 PM" src="https://user-images.githubusercontent.com/116809090/222214199-681fe3e4-26fa-479f-8a89-13f52cc237bb.png">
<br>
The second message received in the server from the client is encrypted<br>
<img width="326" alt="Screenshot 1444-08-09 at 8 19 32 PM" src="https://user-images.githubusercontent.com/116809090/222214297-03c70734-f2fd-4a6d-8ab8-ec3854d8ac10.png">
<br>
<br>
> ## Developers Team
1)@Shaden03
2)@

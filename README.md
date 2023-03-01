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
<img width="540" alt="Screenshot 1444-08-09 at 7 56 25 PM" src="https://user-images.githubusercontent.com/116809090/222208606-c5a5e9c2-4aa5-44ec-b540-6011385cecac.png">
<br>
<br>

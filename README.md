# RMI-

Steps to execute Code

Steps to execute server:

Steps to compile RMI

>javac BankIntf.java
>javac AccountImpl.java
>javac BankServer.java
>javac BankClient.java
>rmic BankImpl
>start rmiregistry
>java BankServer


Output : Serevr is ready

Open New Command Prompt for client side 

>java BankClient 127.0.0.1

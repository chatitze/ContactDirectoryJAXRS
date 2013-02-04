1.Oncelikle sadece cok basic rest web service...
2.Eclipse 4.2 Java EE IDE ve Tomcat Server 7 kullandim.
3.Bunlarin kurulumundan sonra projeyi import edebilirsin :P
ReadXMLFile.java class ta File location i degistirmeyi unutma :)
su anda ("/Users/Chatitze/Documents/workspace/REST1/ContactDirectoryJAXRS/src/contacts.xml")
4.Server startan sonra browser dan; asagidaki linki cagir, son rakam contact ID (1-21 arasi degisebilir), 
netten bir xml file indirip (contacts.xml) kayitli kullanicilarmis gibi kullandim.
5.sonuc browser da; tum xml element ler bitisik gorunuyor, biraz karmasik, ancak bu asamada ui kismina bakmadim.
sadece gittigin link dosyadaki ilgili user a ait bilgileri getiriyor.

6. aslinda bunu bi ara konusalim burdan yazmak ta zor...
simdilik bu kadar :P

1. Project->Clean->select your project (here ContactDirectoryJAXRS) to clean.
2. ReadXMLFile.java; change file path into your local path.

10. call the link in your browser; http://localhost:8080/ContactDirectoryJAXRS/rest/contacts/1
# Spring-Boot-Custom-Banner
 A banner is a text message that is displayed at the start of a Spring Boot application. By default, Spring Boot comes with a banner which shows up as soon as the application starts. However, it is possible to create a custom banner and use it in Spring Boot applications.

To create a custom banner, we need to create the custom banner which will be displayed at the time of application start-up time. We can create the custom banner from scratch or use various tools that will do this for us. We can also use images as banners too. Same as with banner.txt, Spring Boot expects the banner image’s name as banner.gif.

We need to create a text file named banner.txt in the src/main/resources directory and paste the banner content into it. Point to note here is that banner.txt is the default expected banner file name, which Spring Boot uses.

However, if we want to choose any other location or another name for the banner, we need to set the spring.banner.location (spring.banner.location = banner.txt) property in the application.properties file.

However, if we want to turn off the banner, it can be disabled using application.properties configuration settings or programmatically.

Check ou this Articles :- 

1. https://www.baeldung.com/spring-boot-custom-banners (Tutorial)
2. https://www.javacodestuffs.com/2020/05/spring-boot-custom-banner.html (Tutorial and for general understanding, Disabling the Banner)
3. https://springhow.com/spring-boot-banner-generator/ (For Creating a Custom Banner)
4. https://devops.datenkollektiv.de/banner.txt/index.html (For Creating a Custom Banner)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

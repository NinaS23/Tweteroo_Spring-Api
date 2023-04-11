# Tweteroo_spring-api
  <div align='center'>
    <img height="240px" src="https://em-content.zobj.net/source/microsoft-teams/337/bird_1f426.png">
  </div>
  
<p align = "center">
   <img src="https://img.shields.io/badge/author-NinaS23-4dae71?style=flat-square" />
</p>
  
<div align="center">
  <h3>Build With</h3>
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white" height="30px"/>
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" height="30px"/>
</div>

#  features developed 
- [x] Create user
- [X] Create Tweet
- [X] GET the 5 last Tweets
- [X] GET all user Tweets


# Getting Started
To clone the project, run the following command:

```git
git clone https://github.com/NinaS23/Tweteroo_spring-api.git
```
Then navigate to the project file in ApiApplication.java and:

```git
run the project
```

<!-- REQUESTS -->
### &nbsp; ☰ &nbsp; Request

Base url 
```git
 http://localhost:8080
 ```

###### Method HTTP _`POST`_
###### Path _`/sign-up`_

```json
{
  "username": "spongeBob",
  "avatar": "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
}
```

######  Mmethod HTTP _`POST`_
###### Path _`/tweets`_

```json
{
  "username": "spongeBob",
  "tweet": "I love hub"
}
```

###### Method HTTP _`GET`_
- to get last 5 tweets
```git
 http://localhost:8080/tweets?page=1
```

###### Method HTTP _`GET`_
- to get all user tweets
```git
http://localhost:8080/tweets/spongeBob
```

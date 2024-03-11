## Email Microservice

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

### PT-BR
Esse projeto é uma API criada utilizando <b>Java</b>,<b>Java Spring</b> e <b>AWS Simple Service Email</b>.<br>
Foi desenvolvido para resolver o desafio do [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).
  Esse projeto foi desenvolvido com [Kipper Dev](https://youtu.be/eFgeO9M9lLw?si=uyhUXrR-NLEpBW6p)


### EN-US
This project was created using <b>Java</b>, <b>Java Spring</b>, and <b>AWS Simple Email Service</b>.<br>
The project addressed the issue described in the following link [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).
  this project was developed with [Kipper Dev](https://youtu.be/eFgeO9M9lLw?si=uyhUXrR-NLEpBW6p)

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)

## Installation

1. Clone the repository:

```bash
git clone git@github.com:PedroH183/ServiceEmail.git
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to" : "polast2014@gmail.com",
  "subject" : "teste",
  "body" : "testando ... testando ..."
}
```

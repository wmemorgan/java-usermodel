# Java User Model Final Version

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the applications data. This application will also form the basis of a user authentication application developed elsewhere in the course

### Database layout

The table layout is similar to the initial version with the following exceptions:

* The join table userroles is explicitly created. This allows us to add additional columns to the join table
* Since we are creating the join table ourselves, the Many to Many relationship that formed the join table is now two Many to One relationships
* All tables now have audit fields

Thus the new table layout is as follows

* User is the driving table.
* Useremails have a Many-To-One relationship with User. Each User has many user email combinations. Each user email combination has only one User.
* Roles have a Many-To-Many relationship with Users.

![Image of Database Layout](usersfinaldb.png)

Using the provided seed data, expand each endpoint below to see the output it generates.

<details>
<summary>http://localhost:2019/useremails/useremails</summary>

```JSON
```

</details>
<details>
<summary>http://localhost:2019/useremails/useremail/8</summary>

```JSON
```

</details>

<details>
<summary>http://localhost:2019/useremails/useremail/8888</summary>

```JSON
```

</details>

<details>
<summary>DELETE http://localhost:2019/useremails/useremail/8</summary>

```TEXT
```

</details>

<details>
<summary>PUT http://localhost:2019/useremails/useremail/9/email/favbun@hops.local</summary>

```TEXT
```

</details>

<details>
<summary>POST http://localhost:2019/useremails/user/15/email/favbun@hops.local</summary>

```TEXT
```

</details>

---

<details>
<summary>http://localhost:2019/roles/roles</summary>

```JSON
```

</details>

<details>
<summary>http://localhost:2019/roles/role/3</summary>

```JSON
```

</details>

<details>
<summary>http://localhost:2019/roles/role/name/data</summary>

```JSON
```

</details>

<details>
<summary>POST http://localhost:2019/roles/role</summary>

DATA

```JSON
{
    "name" : "ANewRole"
}
```

OUTPUT

```TEXT
```

</details>

---

<details>
<summary>http://localhost:2019/users/users</summary>

```JSON
```

</details>

<details>
<summary>http://localhost:2019/users/user/7</summary>

```JSON
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/cinnamon</summary>

```JSON
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/like/da</summary>

```JSON
```

</details>

<details>
<summary>POST http://localhost:2019/users/user</summary>

DATA

```JSON
{
    "username": "Mojo",
    "primaryemail": "mojo@lambdaschool.local",
    "password" : "Coffee123",
    "useremails": [
        {
            "useremail": "mojo@mymail.local"
        },
        {
            "useremail": "mojo@email.local"
        }
        ],
    "roles": [
        {
           "roleid": 1
        },
        {
           "roleid": 2
        }
        ]
}
```

OUTPUT

```TEXT
```

</details>

<details>
<summary>PUT http://localhost:2019/users/user/15</summary>

DATA

```JSON
{
    "username": "stubs",
    "primaryemail": "stubs@lambdaschool.local",
    "password" : "EarlGray123",
    "useremails": [
        {
            "useremail": "stubs@mymail.local"
        },
        {
            "useremail": "stubs@email.local"
        }
        ]
}
```

OUTPUT

```TEXT
```

</details>

<details>
<summary>PATCH http://localhost:2019/users/user/7</summary>

DATA

```JSON
{
    "username": "cinabun",
    "primaryemail": "cinabun@lambdaschool.home",
    "useremails": [
    {
            "useremail": "cinnamon@mymail.home"
    },
    {
            "useremail": "hops@mymail.home"
    },
    {
            "useremail": "bunny@email.home"
    }
    ]
}
```

OUTPUT

```TEXT
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/14</summary>

```TEXT
```

</details>

---

***New Endpoints for this Version***

<details>
<summary>DELETE localhost:2019/roles/role/3</summary>

```TEXT
```

</details>

<details>
<summary>PUT http://localhost:2019/roles/role/2</summary>

DATA

```JSON
{
    "name" : "CORGI"
}
```

OUTPUT

```TEXT
```

</details>

<details>
<summary>PATCH http://localhost:2019/roles/role/2</summary>

DATA

```JSON
{
    "name" : "MOJO"
}
```

OUTPUT

```TEXT
```

</details>

<details>
<summary>http://localhost:2019/users/user/email/count</summary>

```JSON
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/7/role/2</summary>

```TEXT
```

</details>

<details>
<summary>POST http://localhost:2019/users/user/15/role/1</summary>

```TEXT
```

</details>

<details>
<summary>http://localhost:2019/useremails/username/cinabun</summary>

```JSON
```

</details>

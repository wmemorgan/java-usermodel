# Java User Model Initial Version

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the applications data. This application will also form the basis of a user authentication application developed elsewhere in the course

### Database layout

The table layouts are as follows

* User is the driving table.
* Useremails have a Many-To-One relationship with User. Each User has many user email combinations. Each user email combination has only one User.
* Roles have a Many-To-Many relationship with Users.

![Image of Database Layout](usersdb.png)

Two different applications exist

Notice that this database layout is similar to the layout for the java-crudyrestaurants application.

| Type          | Crudy Restaurants        | Usermodel |
|---------------|--------------------------|-----------|
| Driving Table | Restaurants              | Users     |
| One to Many   | Restaurants -> Menus     | Users -> Useremails |
| Many to Many  | Restaurants <-> Payments | Users <-> Roles |

Same layout, same functions, different data! This is a common feature among backend API systems. They all work basically the same but with their own data!

Using the provided seed data, expand each endpoint below to see the output it generates. This is for the initial version of the application and thus will mirror what is happening in the crudy restaurant application!

<details>
<summary>http://localhost:2019/useremails/useremails</summary>

```JSON
[
    {
        "useremailid": 5,
        "useremail": "admin@email.local",
        "user": {
            "userid": 4,
            "username": "admin",
            "primaryemail": "admin@lambdaschool.local",
            "roles": [
                {
                    "roleid": 1,
                    "name": "ADMIN"
                },
                {
                    "roleid": 2,
                    "name": "USER"
                },
                {
                    "roleid": 3,
                    "name": "DATA"
                }
            ]
        }
    },
    {
        "useremailid": 6,
        "useremail": "admin@mymail.local",
        "user": {
            "userid": 4,
            "username": "admin",
            "primaryemail": "admin@lambdaschool.local",
            "roles": [
                {
                    "roleid": 1,
                    "name": "ADMIN"
                },
                {
                    "roleid": 2,
                    "name": "USER"
                },
                {
                    "roleid": 3,
                    "name": "DATA"
                }
            ]
        }
    },
    {
        "useremailid": 8,
        "useremail": "cinnamon@mymail.local",
        "user": {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                },
                {
                    "roleid": 3,
                    "name": "DATA"
                }
            ]
        }
    },
    {
        "useremailid": 9,
        "useremail": "hops@mymail.local",
        "user": {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                },
                {
                    "roleid": 3,
                    "name": "DATA"
                }
            ]
        }
    },
    {
        "useremailid": 10,
        "useremail": "bunny@email.local",
        "user": {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                },
                {
                    "roleid": 3,
                    "name": "DATA"
                }
            ]
        }
    },
    {
        "useremailid": 12,
        "useremail": "barnbarn@email.local",
        "user": {
            "userid": 11,
            "username": "barnbarn",
            "primaryemail": "barnbarn@lambdaschool.local",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 16,
        "useremail": "qgmy80@gmail.com",
        "user": {
            "userid": 15,
            "username": "matilda.yundt",
            "primaryemail": "curt.buckridge@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 18,
        "useremail": "xlif03@gmail.com",
        "user": {
            "userid": 17,
            "username": "dave.rodriguez",
            "primaryemail": "brent.mitchell@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 20,
        "useremail": "ntjd26@gmail.com",
        "user": {
            "userid": 19,
            "username": "denyse.crona",
            "primaryemail": "shala.bahringer@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 22,
        "useremail": "exvp66@gmail.com",
        "user": {
            "userid": 21,
            "username": "denis.ritchie",
            "primaryemail": "patience.maggio@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 24,
        "useremail": "rrfd13@gmail.com",
        "user": {
            "userid": 23,
            "username": "richard.rosenbaum",
            "primaryemail": "humberto.dooley@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 26,
        "useremail": "poov69@gmail.com",
        "user": {
            "userid": 25,
            "username": "clarence.turner",
            "primaryemail": "edwardo.bashirian@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 28,
        "useremail": "mpig37@gmail.com",
        "user": {
            "userid": 27,
            "username": "leonel.gaylord",
            "primaryemail": "samual.wisoky@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 30,
        "useremail": "bysw47@gmail.com",
        "user": {
            "userid": 29,
            "username": "wayne.turcotte",
            "primaryemail": "earline.oreilly@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 32,
        "useremail": "whkb12@gmail.com",
        "user": {
            "userid": 31,
            "username": "elizebeth.johnson",
            "primaryemail": "saturnina.wintheiser@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 34,
        "useremail": "fqlz02@gmail.com",
        "user": {
            "userid": 33,
            "username": "mavis.prohaska",
            "primaryemail": "donovan.heller@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 36,
        "useremail": "ukig45@gmail.com",
        "user": {
            "userid": 35,
            "username": "josef.bode",
            "primaryemail": "seymour.rempel@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 38,
        "useremail": "wxjz52@gmail.com",
        "user": {
            "userid": 37,
            "username": "jacqui.grady",
            "primaryemail": "mattie.bashirian@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 40,
        "useremail": "bxko72@gmail.com",
        "user": {
            "userid": 39,
            "username": "edwardo.mcdermott",
            "primaryemail": "vicky.brown@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 42,
        "useremail": "etfy55@gmail.com",
        "user": {
            "userid": 41,
            "username": "rigoberto.koelpin",
            "primaryemail": "simon.heathcote@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 44,
        "useremail": "ucph13@gmail.com",
        "user": {
            "userid": 43,
            "username": "celinda.spencer",
            "primaryemail": "priscila.kirlin@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 46,
        "useremail": "dgtc18@gmail.com",
        "user": {
            "userid": 45,
            "username": "nicolette.baumbach",
            "primaryemail": "garland.ankunding@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 48,
        "useremail": "wrxx04@gmail.com",
        "user": {
            "userid": 47,
            "username": "willis.rosenbaum",
            "primaryemail": "leonie.kuhic@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 50,
        "useremail": "dojj12@gmail.com",
        "user": {
            "userid": 49,
            "username": "jonas.ondricka",
            "primaryemail": "chris.braun@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 52,
        "useremail": "bdub60@gmail.com",
        "user": {
            "userid": 51,
            "username": "lanny.prosacco",
            "primaryemail": "gerardo.okeefe@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 54,
        "useremail": "gkyt77@gmail.com",
        "user": {
            "userid": 53,
            "username": "lean.lang",
            "primaryemail": "norene.mcglynn@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 56,
        "useremail": "itbs03@gmail.com",
        "user": {
            "userid": 55,
            "username": "caryn.vonrueden",
            "primaryemail": "deena.casper@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 58,
        "useremail": "xnpj32@gmail.com",
        "user": {
            "userid": 57,
            "username": "lavone.douglas",
            "primaryemail": "gordon.pfannerstill@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 60,
        "useremail": "qxdz57@gmail.com",
        "user": {
            "userid": 59,
            "username": "norbert.gislason",
            "primaryemail": "gaynelle.hintz@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 62,
        "useremail": "rtqc42@gmail.com",
        "user": {
            "userid": 61,
            "username": "evon.gottlieb",
            "primaryemail": "shera.botsford@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 64,
        "useremail": "msim50@gmail.com",
        "user": {
            "userid": 63,
            "username": "deon.damore",
            "primaryemail": "xiao.ratke@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 66,
        "useremail": "mdum96@gmail.com",
        "user": {
            "userid": 65,
            "username": "gaylord.kemmer",
            "primaryemail": "bennie.fay@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 68,
        "useremail": "npfn93@gmail.com",
        "user": {
            "userid": 67,
            "username": "rick.donnelly",
            "primaryemail": "jana.grimes@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 70,
        "useremail": "zwoa10@gmail.com",
        "user": {
            "userid": 69,
            "username": "regenia.gislason",
            "primaryemail": "kittie.kub@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 72,
        "useremail": "mgru08@gmail.com",
        "user": {
            "userid": 71,
            "username": "keturah.hirthe",
            "primaryemail": "madelyn.cummerata@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 74,
        "useremail": "afpj96@gmail.com",
        "user": {
            "userid": 73,
            "username": "marylyn.schmitt",
            "primaryemail": "wiley.shields@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 76,
        "useremail": "oziz06@gmail.com",
        "user": {
            "userid": 75,
            "username": "dacia.cole",
            "primaryemail": "gearldine.effertz@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 78,
        "useremail": "zchl69@gmail.com",
        "user": {
            "userid": 77,
            "username": "sherita.powlowski",
            "primaryemail": "dallas.quitzon@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 80,
        "useremail": "omiz30@gmail.com",
        "user": {
            "userid": 79,
            "username": "iola.nitzsche",
            "primaryemail": "adriene.heathcote@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 82,
        "useremail": "xvcg63@gmail.com",
        "user": {
            "userid": 81,
            "username": "marcelo.shields",
            "primaryemail": "verlie.macgyver@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 84,
        "useremail": "yssh13@gmail.com",
        "user": {
            "userid": 83,
            "username": "dirk.jacobson",
            "primaryemail": "gail.sauer@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 86,
        "useremail": "ppbf70@gmail.com",
        "user": {
            "userid": 85,
            "username": "glinda.bogisich",
            "primaryemail": "susan.altenwerth@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 88,
        "useremail": "qzhg91@gmail.com",
        "user": {
            "userid": 87,
            "username": "marry.kling",
            "primaryemail": "porter.pacocha@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 90,
        "useremail": "olwn04@gmail.com",
        "user": {
            "userid": 89,
            "username": "socorro.connelly",
            "primaryemail": "suzan.osinski@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 92,
        "useremail": "osvf94@gmail.com",
        "user": {
            "userid": 91,
            "username": "edith.greenholt",
            "primaryemail": "alaina.mayert@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 94,
        "useremail": "jnbm21@gmail.com",
        "user": {
            "userid": 93,
            "username": "jacinto.moen",
            "primaryemail": "boyce.jakubowski@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 96,
        "useremail": "hcas79@gmail.com",
        "user": {
            "userid": 95,
            "username": "del.gibson",
            "primaryemail": "ronnie.metz@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 98,
        "useremail": "tuck65@gmail.com",
        "user": {
            "userid": 97,
            "username": "melvin.braun",
            "primaryemail": "rory.jones@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 100,
        "useremail": "jzvg60@gmail.com",
        "user": {
            "userid": 99,
            "username": "tory.oreilly",
            "primaryemail": "cody.watsica@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 102,
        "useremail": "iugx85@gmail.com",
        "user": {
            "userid": 101,
            "username": "patria.walker",
            "primaryemail": "claudette.zulauf@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 104,
        "useremail": "hnpq15@gmail.com",
        "user": {
            "userid": 103,
            "username": "august.mante",
            "primaryemail": "isidro.daniel@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 106,
        "useremail": "nwjb49@gmail.com",
        "user": {
            "userid": 105,
            "username": "lyndsey.ledner",
            "primaryemail": "dominga.stoltenberg@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 108,
        "useremail": "wrzk27@gmail.com",
        "user": {
            "userid": 107,
            "username": "napoleon.farrell",
            "primaryemail": "ashly.prosacco@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 110,
        "useremail": "msxd77@gmail.com",
        "user": {
            "userid": 109,
            "username": "rigoberto.douglas",
            "primaryemail": "emilio.rath@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 112,
        "useremail": "qttt00@gmail.com",
        "user": {
            "userid": 111,
            "username": "william.stehr",
            "primaryemail": "saul.bradtke@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 114,
        "useremail": "xfvn58@gmail.com",
        "user": {
            "userid": 113,
            "username": "ann.kilback",
            "primaryemail": "gidget.bernier@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 116,
        "useremail": "wspo72@gmail.com",
        "user": {
            "userid": 115,
            "username": "vania.ortiz",
            "primaryemail": "roscoe.cartwright@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 118,
        "useremail": "fgbc05@gmail.com",
        "user": {
            "userid": 117,
            "username": "shauna.walter",
            "primaryemail": "paris.parker@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 120,
        "useremail": "ekai96@gmail.com",
        "user": {
            "userid": 119,
            "username": "rosamond.douglas",
            "primaryemail": "lynwood.schuster@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 122,
        "useremail": "ffkd22@gmail.com",
        "user": {
            "userid": 121,
            "username": "angela.wintheiser",
            "primaryemail": "sylvie.anderson@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 124,
        "useremail": "htfj65@gmail.com",
        "user": {
            "userid": 123,
            "username": "dulce.koss",
            "primaryemail": "noah.runolfsdottir@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 126,
        "useremail": "gefm82@gmail.com",
        "user": {
            "userid": 125,
            "username": "christa.schmidt",
            "primaryemail": "jordan.connelly@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 128,
        "useremail": "hije89@gmail.com",
        "user": {
            "userid": 127,
            "username": "migdalia.ondricka",
            "primaryemail": "davida.hilll@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 130,
        "useremail": "lkwm29@gmail.com",
        "user": {
            "userid": 129,
            "username": "blaine.kerluke",
            "primaryemail": "easter.fisher@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 132,
        "useremail": "affl03@gmail.com",
        "user": {
            "userid": 131,
            "username": "williams.langosh",
            "primaryemail": "vance.brown@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 134,
        "useremail": "ydij67@gmail.com",
        "user": {
            "userid": 133,
            "username": "agripina.ruecker",
            "primaryemail": "dominga.gorczany@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 136,
        "useremail": "znpf34@gmail.com",
        "user": {
            "userid": 135,
            "username": "rosetta.mosciski",
            "primaryemail": "jaclyn.williamson@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 138,
        "useremail": "ijlc86@gmail.com",
        "user": {
            "userid": 137,
            "username": "minh.pacocha",
            "primaryemail": "dollie.bechtelar@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 140,
        "useremail": "xtks93@gmail.com",
        "user": {
            "userid": 139,
            "username": "thu.vonrueden",
            "primaryemail": "cherelle.hermiston@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 142,
        "useremail": "qilq50@gmail.com",
        "user": {
            "userid": 141,
            "username": "ranee.glover",
            "primaryemail": "daryl.brakus@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 144,
        "useremail": "olsh71@gmail.com",
        "user": {
            "userid": 143,
            "username": "cody.green",
            "primaryemail": "genna.schuster@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 146,
        "useremail": "sgtd73@gmail.com",
        "user": {
            "userid": 145,
            "username": "dewitt.wehner",
            "primaryemail": "treva.von@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 148,
        "useremail": "wrjq40@gmail.com",
        "user": {
            "userid": 147,
            "username": "santos.grant",
            "primaryemail": "yi.hahn@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 150,
        "useremail": "dzpo34@gmail.com",
        "user": {
            "userid": 149,
            "username": "harris.ohara",
            "primaryemail": "ricardo.dubuque@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 152,
        "useremail": "exyg13@gmail.com",
        "user": {
            "userid": 151,
            "username": "eustolia.blanda",
            "primaryemail": "scotty.bashirian@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 154,
        "useremail": "klfs87@gmail.com",
        "user": {
            "userid": 153,
            "username": "theodora.gulgowski",
            "primaryemail": "alphonso.quigley@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 156,
        "useremail": "ugmd90@gmail.com",
        "user": {
            "userid": 155,
            "username": "terrell.heller",
            "primaryemail": "milford.batz@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 158,
        "useremail": "pzat24@gmail.com",
        "user": {
            "userid": 157,
            "username": "aleshia.kub",
            "primaryemail": "augustine.krajcik@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 160,
        "useremail": "rwza71@gmail.com",
        "user": {
            "userid": 159,
            "username": "carlo.bruen",
            "primaryemail": "ambrose.lockman@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 162,
        "useremail": "mmou49@gmail.com",
        "user": {
            "userid": 161,
            "username": "eli.langworth",
            "primaryemail": "king.bernhard@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 164,
        "useremail": "wrwv26@gmail.com",
        "user": {
            "userid": 163,
            "username": "christian.schroeder",
            "primaryemail": "santana.stoltenberg@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 166,
        "useremail": "agxm74@gmail.com",
        "user": {
            "userid": 165,
            "username": "lowell.schoen",
            "primaryemail": "evelyne.bechtelar@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 168,
        "useremail": "kcrb38@gmail.com",
        "user": {
            "userid": 167,
            "username": "marinda.hettinger",
            "primaryemail": "rodrick.kirlin@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 170,
        "useremail": "matj06@gmail.com",
        "user": {
            "userid": 169,
            "username": "gustavo.weber",
            "primaryemail": "karine.luettgen@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 172,
        "useremail": "ejgd15@gmail.com",
        "user": {
            "userid": 171,
            "username": "rory.jakubowski",
            "primaryemail": "laureen.walsh@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 174,
        "useremail": "ddyh01@gmail.com",
        "user": {
            "userid": 173,
            "username": "mitch.runte",
            "primaryemail": "royal.schaden@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 176,
        "useremail": "rsxi82@gmail.com",
        "user": {
            "userid": 175,
            "username": "elton.grady",
            "primaryemail": "savanna.marks@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 178,
        "useremail": "ezwt57@gmail.com",
        "user": {
            "userid": 177,
            "username": "cornell.deckow",
            "primaryemail": "britt.hintz@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 180,
        "useremail": "hjvv93@gmail.com",
        "user": {
            "userid": 179,
            "username": "carol.beier",
            "primaryemail": "elsie.walsh@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 182,
        "useremail": "xwrk46@gmail.com",
        "user": {
            "userid": 181,
            "username": "octavia.heaney",
            "primaryemail": "belia.parker@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 184,
        "useremail": "ylnx08@gmail.com",
        "user": {
            "userid": 183,
            "username": "kraig.hand",
            "primaryemail": "syreeta.satterfield@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 186,
        "useremail": "qeqm63@gmail.com",
        "user": {
            "userid": 185,
            "username": "moses.hoppe",
            "primaryemail": "brady.friesen@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 188,
        "useremail": "rset43@gmail.com",
        "user": {
            "userid": 187,
            "username": "ami.windler",
            "primaryemail": "melvin.hudson@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 190,
        "useremail": "icrz24@gmail.com",
        "user": {
            "userid": 189,
            "username": "andrew.prosacco",
            "primaryemail": "milan.kautzer@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 192,
        "useremail": "wmkh03@gmail.com",
        "user": {
            "userid": 191,
            "username": "audra.mills",
            "primaryemail": "sarita.herzog@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 194,
        "useremail": "hrjj76@gmail.com",
        "user": {
            "userid": 193,
            "username": "melony.von",
            "primaryemail": "fern.kautzer@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 196,
        "useremail": "doev22@gmail.com",
        "user": {
            "userid": 195,
            "username": "renaldo.klocko",
            "primaryemail": "giovanni.beahan@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 198,
        "useremail": "cnvx02@gmail.com",
        "user": {
            "userid": 197,
            "username": "leroy.oconner",
            "primaryemail": "willodean.schmidt@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 200,
        "useremail": "bvlt19@gmail.com",
        "user": {
            "userid": 199,
            "username": "justin.cassin",
            "primaryemail": "tommy.fisher@hotmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 202,
        "useremail": "tbhv64@gmail.com",
        "user": {
            "userid": 201,
            "username": "earleen.braun",
            "primaryemail": "genoveva.effertz@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 204,
        "useremail": "lmqv92@gmail.com",
        "user": {
            "userid": 203,
            "username": "iraida.schuppe",
            "primaryemail": "kacey.schaden@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 206,
        "useremail": "oaej42@gmail.com",
        "user": {
            "userid": 205,
            "username": "deshawn.ledner",
            "primaryemail": "veola.king@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 208,
        "useremail": "ahma01@gmail.com",
        "user": {
            "userid": 207,
            "username": "regenia.cormier",
            "primaryemail": "zachery.hyatt@yahoo.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 210,
        "useremail": "kwuk73@gmail.com",
        "user": {
            "userid": 209,
            "username": "arletha.runte",
            "primaryemail": "gerardo.torphy@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 212,
        "useremail": "hoyu63@gmail.com",
        "user": {
            "userid": 211,
            "username": "sterling.howe",
            "primaryemail": "pete.spinka@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    },
    {
        "useremailid": 214,
        "useremail": "gvsw20@gmail.com",
        "user": {
            "userid": 213,
            "username": "maybell.murray",
            "primaryemail": "brittani.kassulke@gmail.com",
            "roles": [
                {
                    "roleid": 2,
                    "name": "USER"
                }
            ]
        }
    }
]
```

</details>
<details>
<summary>http://localhost:2019/useremails/useremail/8</summary>

```JSON
{
    "useremailid": 8,
    "useremail": "cinnamon@mymail.local",
    "user": {
        "userid": 7,
        "username": "cinnamon",
        "primaryemail": "cinnamon@lambdaschool.local",
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            },
            {
                "roleid": 3,
                "name": "DATA"
            }
        ]
    }
}
```

</details>

<details>
<summary>http://localhost:2019/useremails/useremail/8888</summary>

```JSON
{
    "timestamp": "2020-03-05T23:45:36.861+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "Useremail with id 8888 Not Found!",
    "trace": "javax.persistence.EntityNotFoundException: Useremail with id 8888 Not Found!\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.lambda$findUseremailById$0(UseremailServiceImpl.java:39)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:408)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.findUseremailById(UseremailServiceImpl.java:39)\n\tat com.lambdaschool.usermodel.controllers.UseremailController.getUserEmailById(UseremailController.java:55)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:879)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:634)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:541)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:367)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1639)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:834)\n",
    "path": "/useremails/useremail/8888"
}
```

</details>

<details>
<summary>DELETE http://localhost:2019/useremails/useremail/8</summary>

```TEXT
No Data

Status OK
```

</details>

<details>
<summary>PUT http://localhost:2019/useremails/useremail/9/email/favbun@hops.local</summary>

```TEXT
No Data

Status OK
```

</details>

<details>
<summary>http://localhost:2019/roles/roles</summary>

```JSON
[
    {
        "roleid": 1,
        "name": "ADMIN",
        "users": [
            {
                "userid": 4,
                "username": "admin",
                "primaryemail": "admin@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 5,
                        "useremail": "admin@email.local"
                    },
                    {
                        "useremailid": 6,
                        "useremail": "admin@mymail.local"
                    }
                ]
            }
        ]
    },
    {
        "roleid": 2,
        "name": "USER",
        "users": [
            {
                "userid": 4,
                "username": "admin",
                "primaryemail": "admin@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 5,
                        "useremail": "admin@email.local"
                    },
                    {
                        "useremailid": 6,
                        "useremail": "admin@mymail.local"
                    }
                ]
            },
            {
                "userid": 7,
                "username": "cinnamon",
                "primaryemail": "cinnamon@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 9,
                        "useremail": "favbun@hops.local"
                    },
                    {
                        "useremailid": 10,
                        "useremail": "bunny@email.local"
                    }
                ]
            },
            {
                "userid": 11,
                "username": "barnbarn",
                "primaryemail": "barnbarn@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 12,
                        "useremail": "barnbarn@email.local"
                    }
                ]
            },
            {
                "userid": 13,
                "username": "puttat",
                "primaryemail": "puttat@school.lambda",
                "useremails": []
            },
            {
                "userid": 14,
                "username": "misskitty",
                "primaryemail": "misskitty@school.lambda",
                "useremails": []
            },
            {
                "userid": 15,
                "username": "matilda.yundt",
                "primaryemail": "curt.buckridge@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 16,
                        "useremail": "qgmy80@gmail.com"
                    }
                ]
            },
            {
                "userid": 17,
                "username": "dave.rodriguez",
                "primaryemail": "brent.mitchell@gmail.com",
                "useremails": [
                    {
                        "useremailid": 18,
                        "useremail": "xlif03@gmail.com"
                    }
                ]
            },
            {
                "userid": 19,
                "username": "denyse.crona",
                "primaryemail": "shala.bahringer@gmail.com",
                "useremails": [
                    {
                        "useremailid": 20,
                        "useremail": "ntjd26@gmail.com"
                    }
                ]
            },
            {
                "userid": 21,
                "username": "denis.ritchie",
                "primaryemail": "patience.maggio@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 22,
                        "useremail": "exvp66@gmail.com"
                    }
                ]
            },
            {
                "userid": 23,
                "username": "richard.rosenbaum",
                "primaryemail": "humberto.dooley@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 24,
                        "useremail": "rrfd13@gmail.com"
                    }
                ]
            },
            {
                "userid": 25,
                "username": "clarence.turner",
                "primaryemail": "edwardo.bashirian@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 26,
                        "useremail": "poov69@gmail.com"
                    }
                ]
            },
            {
                "userid": 27,
                "username": "leonel.gaylord",
                "primaryemail": "samual.wisoky@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 28,
                        "useremail": "mpig37@gmail.com"
                    }
                ]
            },
            {
                "userid": 29,
                "username": "wayne.turcotte",
                "primaryemail": "earline.oreilly@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 30,
                        "useremail": "bysw47@gmail.com"
                    }
                ]
            },
            {
                "userid": 31,
                "username": "elizebeth.johnson",
                "primaryemail": "saturnina.wintheiser@gmail.com",
                "useremails": [
                    {
                        "useremailid": 32,
                        "useremail": "whkb12@gmail.com"
                    }
                ]
            },
            {
                "userid": 33,
                "username": "mavis.prohaska",
                "primaryemail": "donovan.heller@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 34,
                        "useremail": "fqlz02@gmail.com"
                    }
                ]
            },
            {
                "userid": 35,
                "username": "josef.bode",
                "primaryemail": "seymour.rempel@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 36,
                        "useremail": "ukig45@gmail.com"
                    }
                ]
            },
            {
                "userid": 37,
                "username": "jacqui.grady",
                "primaryemail": "mattie.bashirian@gmail.com",
                "useremails": [
                    {
                        "useremailid": 38,
                        "useremail": "wxjz52@gmail.com"
                    }
                ]
            },
            {
                "userid": 39,
                "username": "edwardo.mcdermott",
                "primaryemail": "vicky.brown@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 40,
                        "useremail": "bxko72@gmail.com"
                    }
                ]
            },
            {
                "userid": 41,
                "username": "rigoberto.koelpin",
                "primaryemail": "simon.heathcote@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 42,
                        "useremail": "etfy55@gmail.com"
                    }
                ]
            },
            {
                "userid": 43,
                "username": "celinda.spencer",
                "primaryemail": "priscila.kirlin@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 44,
                        "useremail": "ucph13@gmail.com"
                    }
                ]
            },
            {
                "userid": 45,
                "username": "nicolette.baumbach",
                "primaryemail": "garland.ankunding@gmail.com",
                "useremails": [
                    {
                        "useremailid": 46,
                        "useremail": "dgtc18@gmail.com"
                    }
                ]
            },
            {
                "userid": 47,
                "username": "willis.rosenbaum",
                "primaryemail": "leonie.kuhic@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 48,
                        "useremail": "wrxx04@gmail.com"
                    }
                ]
            },
            {
                "userid": 49,
                "username": "jonas.ondricka",
                "primaryemail": "chris.braun@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 50,
                        "useremail": "dojj12@gmail.com"
                    }
                ]
            },
            {
                "userid": 51,
                "username": "lanny.prosacco",
                "primaryemail": "gerardo.okeefe@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 52,
                        "useremail": "bdub60@gmail.com"
                    }
                ]
            },
            {
                "userid": 53,
                "username": "lean.lang",
                "primaryemail": "norene.mcglynn@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 54,
                        "useremail": "gkyt77@gmail.com"
                    }
                ]
            },
            {
                "userid": 55,
                "username": "caryn.vonrueden",
                "primaryemail": "deena.casper@gmail.com",
                "useremails": [
                    {
                        "useremailid": 56,
                        "useremail": "itbs03@gmail.com"
                    }
                ]
            },
            {
                "userid": 57,
                "username": "lavone.douglas",
                "primaryemail": "gordon.pfannerstill@gmail.com",
                "useremails": [
                    {
                        "useremailid": 58,
                        "useremail": "xnpj32@gmail.com"
                    }
                ]
            },
            {
                "userid": 59,
                "username": "norbert.gislason",
                "primaryemail": "gaynelle.hintz@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 60,
                        "useremail": "qxdz57@gmail.com"
                    }
                ]
            },
            {
                "userid": 61,
                "username": "evon.gottlieb",
                "primaryemail": "shera.botsford@gmail.com",
                "useremails": [
                    {
                        "useremailid": 62,
                        "useremail": "rtqc42@gmail.com"
                    }
                ]
            },
            {
                "userid": 63,
                "username": "deon.damore",
                "primaryemail": "xiao.ratke@gmail.com",
                "useremails": [
                    {
                        "useremailid": 64,
                        "useremail": "msim50@gmail.com"
                    }
                ]
            },
            {
                "userid": 65,
                "username": "gaylord.kemmer",
                "primaryemail": "bennie.fay@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 66,
                        "useremail": "mdum96@gmail.com"
                    }
                ]
            },
            {
                "userid": 67,
                "username": "rick.donnelly",
                "primaryemail": "jana.grimes@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 68,
                        "useremail": "npfn93@gmail.com"
                    }
                ]
            },
            {
                "userid": 69,
                "username": "regenia.gislason",
                "primaryemail": "kittie.kub@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 70,
                        "useremail": "zwoa10@gmail.com"
                    }
                ]
            },
            {
                "userid": 71,
                "username": "keturah.hirthe",
                "primaryemail": "madelyn.cummerata@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 72,
                        "useremail": "mgru08@gmail.com"
                    }
                ]
            },
            {
                "userid": 73,
                "username": "marylyn.schmitt",
                "primaryemail": "wiley.shields@gmail.com",
                "useremails": [
                    {
                        "useremailid": 74,
                        "useremail": "afpj96@gmail.com"
                    }
                ]
            },
            {
                "userid": 75,
                "username": "dacia.cole",
                "primaryemail": "gearldine.effertz@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 76,
                        "useremail": "oziz06@gmail.com"
                    }
                ]
            },
            {
                "userid": 77,
                "username": "sherita.powlowski",
                "primaryemail": "dallas.quitzon@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 78,
                        "useremail": "zchl69@gmail.com"
                    }
                ]
            },
            {
                "userid": 79,
                "username": "iola.nitzsche",
                "primaryemail": "adriene.heathcote@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 80,
                        "useremail": "omiz30@gmail.com"
                    }
                ]
            },
            {
                "userid": 81,
                "username": "marcelo.shields",
                "primaryemail": "verlie.macgyver@gmail.com",
                "useremails": [
                    {
                        "useremailid": 82,
                        "useremail": "xvcg63@gmail.com"
                    }
                ]
            },
            {
                "userid": 83,
                "username": "dirk.jacobson",
                "primaryemail": "gail.sauer@gmail.com",
                "useremails": [
                    {
                        "useremailid": 84,
                        "useremail": "yssh13@gmail.com"
                    }
                ]
            },
            {
                "userid": 85,
                "username": "glinda.bogisich",
                "primaryemail": "susan.altenwerth@gmail.com",
                "useremails": [
                    {
                        "useremailid": 86,
                        "useremail": "ppbf70@gmail.com"
                    }
                ]
            },
            {
                "userid": 87,
                "username": "marry.kling",
                "primaryemail": "porter.pacocha@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 88,
                        "useremail": "qzhg91@gmail.com"
                    }
                ]
            },
            {
                "userid": 89,
                "username": "socorro.connelly",
                "primaryemail": "suzan.osinski@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 90,
                        "useremail": "olwn04@gmail.com"
                    }
                ]
            },
            {
                "userid": 91,
                "username": "edith.greenholt",
                "primaryemail": "alaina.mayert@gmail.com",
                "useremails": [
                    {
                        "useremailid": 92,
                        "useremail": "osvf94@gmail.com"
                    }
                ]
            },
            {
                "userid": 93,
                "username": "jacinto.moen",
                "primaryemail": "boyce.jakubowski@gmail.com",
                "useremails": [
                    {
                        "useremailid": 94,
                        "useremail": "jnbm21@gmail.com"
                    }
                ]
            },
            {
                "userid": 95,
                "username": "del.gibson",
                "primaryemail": "ronnie.metz@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 96,
                        "useremail": "hcas79@gmail.com"
                    }
                ]
            },
            {
                "userid": 97,
                "username": "melvin.braun",
                "primaryemail": "rory.jones@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 98,
                        "useremail": "tuck65@gmail.com"
                    }
                ]
            },
            {
                "userid": 99,
                "username": "tory.oreilly",
                "primaryemail": "cody.watsica@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 100,
                        "useremail": "jzvg60@gmail.com"
                    }
                ]
            },
            {
                "userid": 101,
                "username": "patria.walker",
                "primaryemail": "claudette.zulauf@gmail.com",
                "useremails": [
                    {
                        "useremailid": 102,
                        "useremail": "iugx85@gmail.com"
                    }
                ]
            },
            {
                "userid": 103,
                "username": "august.mante",
                "primaryemail": "isidro.daniel@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 104,
                        "useremail": "hnpq15@gmail.com"
                    }
                ]
            },
            {
                "userid": 105,
                "username": "lyndsey.ledner",
                "primaryemail": "dominga.stoltenberg@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 106,
                        "useremail": "nwjb49@gmail.com"
                    }
                ]
            },
            {
                "userid": 107,
                "username": "napoleon.farrell",
                "primaryemail": "ashly.prosacco@gmail.com",
                "useremails": [
                    {
                        "useremailid": 108,
                        "useremail": "wrzk27@gmail.com"
                    }
                ]
            },
            {
                "userid": 109,
                "username": "rigoberto.douglas",
                "primaryemail": "emilio.rath@gmail.com",
                "useremails": [
                    {
                        "useremailid": 110,
                        "useremail": "msxd77@gmail.com"
                    }
                ]
            },
            {
                "userid": 111,
                "username": "william.stehr",
                "primaryemail": "saul.bradtke@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 112,
                        "useremail": "qttt00@gmail.com"
                    }
                ]
            },
            {
                "userid": 113,
                "username": "ann.kilback",
                "primaryemail": "gidget.bernier@gmail.com",
                "useremails": [
                    {
                        "useremailid": 114,
                        "useremail": "xfvn58@gmail.com"
                    }
                ]
            },
            {
                "userid": 115,
                "username": "vania.ortiz",
                "primaryemail": "roscoe.cartwright@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 116,
                        "useremail": "wspo72@gmail.com"
                    }
                ]
            },
            {
                "userid": 117,
                "username": "shauna.walter",
                "primaryemail": "paris.parker@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 118,
                        "useremail": "fgbc05@gmail.com"
                    }
                ]
            },
            {
                "userid": 119,
                "username": "rosamond.douglas",
                "primaryemail": "lynwood.schuster@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 120,
                        "useremail": "ekai96@gmail.com"
                    }
                ]
            },
            {
                "userid": 121,
                "username": "angela.wintheiser",
                "primaryemail": "sylvie.anderson@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 122,
                        "useremail": "ffkd22@gmail.com"
                    }
                ]
            },
            {
                "userid": 123,
                "username": "dulce.koss",
                "primaryemail": "noah.runolfsdottir@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 124,
                        "useremail": "htfj65@gmail.com"
                    }
                ]
            },
            {
                "userid": 125,
                "username": "christa.schmidt",
                "primaryemail": "jordan.connelly@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 126,
                        "useremail": "gefm82@gmail.com"
                    }
                ]
            },
            {
                "userid": 127,
                "username": "migdalia.ondricka",
                "primaryemail": "davida.hilll@gmail.com",
                "useremails": [
                    {
                        "useremailid": 128,
                        "useremail": "hije89@gmail.com"
                    }
                ]
            },
            {
                "userid": 129,
                "username": "blaine.kerluke",
                "primaryemail": "easter.fisher@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 130,
                        "useremail": "lkwm29@gmail.com"
                    }
                ]
            },
            {
                "userid": 131,
                "username": "williams.langosh",
                "primaryemail": "vance.brown@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 132,
                        "useremail": "affl03@gmail.com"
                    }
                ]
            },
            {
                "userid": 133,
                "username": "agripina.ruecker",
                "primaryemail": "dominga.gorczany@gmail.com",
                "useremails": [
                    {
                        "useremailid": 134,
                        "useremail": "ydij67@gmail.com"
                    }
                ]
            },
            {
                "userid": 135,
                "username": "rosetta.mosciski",
                "primaryemail": "jaclyn.williamson@gmail.com",
                "useremails": [
                    {
                        "useremailid": 136,
                        "useremail": "znpf34@gmail.com"
                    }
                ]
            },
            {
                "userid": 137,
                "username": "minh.pacocha",
                "primaryemail": "dollie.bechtelar@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 138,
                        "useremail": "ijlc86@gmail.com"
                    }
                ]
            },
            {
                "userid": 139,
                "username": "thu.vonrueden",
                "primaryemail": "cherelle.hermiston@gmail.com",
                "useremails": [
                    {
                        "useremailid": 140,
                        "useremail": "xtks93@gmail.com"
                    }
                ]
            },
            {
                "userid": 141,
                "username": "ranee.glover",
                "primaryemail": "daryl.brakus@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 142,
                        "useremail": "qilq50@gmail.com"
                    }
                ]
            },
            {
                "userid": 143,
                "username": "cody.green",
                "primaryemail": "genna.schuster@gmail.com",
                "useremails": [
                    {
                        "useremailid": 144,
                        "useremail": "olsh71@gmail.com"
                    }
                ]
            },
            {
                "userid": 145,
                "username": "dewitt.wehner",
                "primaryemail": "treva.von@gmail.com",
                "useremails": [
                    {
                        "useremailid": 146,
                        "useremail": "sgtd73@gmail.com"
                    }
                ]
            },
            {
                "userid": 147,
                "username": "santos.grant",
                "primaryemail": "yi.hahn@gmail.com",
                "useremails": [
                    {
                        "useremailid": 148,
                        "useremail": "wrjq40@gmail.com"
                    }
                ]
            },
            {
                "userid": 149,
                "username": "harris.ohara",
                "primaryemail": "ricardo.dubuque@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 150,
                        "useremail": "dzpo34@gmail.com"
                    }
                ]
            },
            {
                "userid": 151,
                "username": "eustolia.blanda",
                "primaryemail": "scotty.bashirian@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 152,
                        "useremail": "exyg13@gmail.com"
                    }
                ]
            },
            {
                "userid": 153,
                "username": "theodora.gulgowski",
                "primaryemail": "alphonso.quigley@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 154,
                        "useremail": "klfs87@gmail.com"
                    }
                ]
            },
            {
                "userid": 155,
                "username": "terrell.heller",
                "primaryemail": "milford.batz@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 156,
                        "useremail": "ugmd90@gmail.com"
                    }
                ]
            },
            {
                "userid": 157,
                "username": "aleshia.kub",
                "primaryemail": "augustine.krajcik@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 158,
                        "useremail": "pzat24@gmail.com"
                    }
                ]
            },
            {
                "userid": 159,
                "username": "carlo.bruen",
                "primaryemail": "ambrose.lockman@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 160,
                        "useremail": "rwza71@gmail.com"
                    }
                ]
            },
            {
                "userid": 161,
                "username": "eli.langworth",
                "primaryemail": "king.bernhard@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 162,
                        "useremail": "mmou49@gmail.com"
                    }
                ]
            },
            {
                "userid": 163,
                "username": "christian.schroeder",
                "primaryemail": "santana.stoltenberg@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 164,
                        "useremail": "wrwv26@gmail.com"
                    }
                ]
            },
            {
                "userid": 165,
                "username": "lowell.schoen",
                "primaryemail": "evelyne.bechtelar@gmail.com",
                "useremails": [
                    {
                        "useremailid": 166,
                        "useremail": "agxm74@gmail.com"
                    }
                ]
            },
            {
                "userid": 167,
                "username": "marinda.hettinger",
                "primaryemail": "rodrick.kirlin@gmail.com",
                "useremails": [
                    {
                        "useremailid": 168,
                        "useremail": "kcrb38@gmail.com"
                    }
                ]
            },
            {
                "userid": 169,
                "username": "gustavo.weber",
                "primaryemail": "karine.luettgen@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 170,
                        "useremail": "matj06@gmail.com"
                    }
                ]
            },
            {
                "userid": 171,
                "username": "rory.jakubowski",
                "primaryemail": "laureen.walsh@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 172,
                        "useremail": "ejgd15@gmail.com"
                    }
                ]
            },
            {
                "userid": 173,
                "username": "mitch.runte",
                "primaryemail": "royal.schaden@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 174,
                        "useremail": "ddyh01@gmail.com"
                    }
                ]
            },
            {
                "userid": 175,
                "username": "elton.grady",
                "primaryemail": "savanna.marks@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 176,
                        "useremail": "rsxi82@gmail.com"
                    }
                ]
            },
            {
                "userid": 177,
                "username": "cornell.deckow",
                "primaryemail": "britt.hintz@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 178,
                        "useremail": "ezwt57@gmail.com"
                    }
                ]
            },
            {
                "userid": 179,
                "username": "carol.beier",
                "primaryemail": "elsie.walsh@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 180,
                        "useremail": "hjvv93@gmail.com"
                    }
                ]
            },
            {
                "userid": 181,
                "username": "octavia.heaney",
                "primaryemail": "belia.parker@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 182,
                        "useremail": "xwrk46@gmail.com"
                    }
                ]
            },
            {
                "userid": 183,
                "username": "kraig.hand",
                "primaryemail": "syreeta.satterfield@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 184,
                        "useremail": "ylnx08@gmail.com"
                    }
                ]
            },
            {
                "userid": 185,
                "username": "moses.hoppe",
                "primaryemail": "brady.friesen@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 186,
                        "useremail": "qeqm63@gmail.com"
                    }
                ]
            },
            {
                "userid": 187,
                "username": "ami.windler",
                "primaryemail": "melvin.hudson@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 188,
                        "useremail": "rset43@gmail.com"
                    }
                ]
            },
            {
                "userid": 189,
                "username": "andrew.prosacco",
                "primaryemail": "milan.kautzer@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 190,
                        "useremail": "icrz24@gmail.com"
                    }
                ]
            },
            {
                "userid": 191,
                "username": "audra.mills",
                "primaryemail": "sarita.herzog@gmail.com",
                "useremails": [
                    {
                        "useremailid": 192,
                        "useremail": "wmkh03@gmail.com"
                    }
                ]
            },
            {
                "userid": 193,
                "username": "melony.von",
                "primaryemail": "fern.kautzer@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 194,
                        "useremail": "hrjj76@gmail.com"
                    }
                ]
            },
            {
                "userid": 195,
                "username": "renaldo.klocko",
                "primaryemail": "giovanni.beahan@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 196,
                        "useremail": "doev22@gmail.com"
                    }
                ]
            },
            {
                "userid": 197,
                "username": "leroy.oconner",
                "primaryemail": "willodean.schmidt@gmail.com",
                "useremails": [
                    {
                        "useremailid": 198,
                        "useremail": "cnvx02@gmail.com"
                    }
                ]
            },
            {
                "userid": 199,
                "username": "justin.cassin",
                "primaryemail": "tommy.fisher@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 200,
                        "useremail": "bvlt19@gmail.com"
                    }
                ]
            },
            {
                "userid": 201,
                "username": "earleen.braun",
                "primaryemail": "genoveva.effertz@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 202,
                        "useremail": "tbhv64@gmail.com"
                    }
                ]
            },
            {
                "userid": 203,
                "username": "iraida.schuppe",
                "primaryemail": "kacey.schaden@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 204,
                        "useremail": "lmqv92@gmail.com"
                    }
                ]
            },
            {
                "userid": 205,
                "username": "deshawn.ledner",
                "primaryemail": "veola.king@gmail.com",
                "useremails": [
                    {
                        "useremailid": 206,
                        "useremail": "oaej42@gmail.com"
                    }
                ]
            },
            {
                "userid": 207,
                "username": "regenia.cormier",
                "primaryemail": "zachery.hyatt@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 208,
                        "useremail": "ahma01@gmail.com"
                    }
                ]
            },
            {
                "userid": 209,
                "username": "arletha.runte",
                "primaryemail": "gerardo.torphy@gmail.com",
                "useremails": [
                    {
                        "useremailid": 210,
                        "useremail": "kwuk73@gmail.com"
                    }
                ]
            },
            {
                "userid": 211,
                "username": "sterling.howe",
                "primaryemail": "pete.spinka@gmail.com",
                "useremails": [
                    {
                        "useremailid": 212,
                        "useremail": "hoyu63@gmail.com"
                    }
                ]
            },
            {
                "userid": 213,
                "username": "maybell.murray",
                "primaryemail": "brittani.kassulke@gmail.com",
                "useremails": [
                    {
                        "useremailid": 214,
                        "useremail": "gvsw20@gmail.com"
                    }
                ]
            }
        ]
    },
    {
        "roleid": 3,
        "name": "DATA",
        "users": [
            {
                "userid": 4,
                "username": "admin",
                "primaryemail": "admin@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 5,
                        "useremail": "admin@email.local"
                    },
                    {
                        "useremailid": 6,
                        "useremail": "admin@mymail.local"
                    }
                ]
            },
            {
                "userid": 7,
                "username": "cinnamon",
                "primaryemail": "cinnamon@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 9,
                        "useremail": "favbun@hops.local"
                    },
                    {
                        "useremailid": 10,
                        "useremail": "bunny@email.local"
                    }
                ]
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/roles/role/3</summary>

```JSON
{
    "roleid": 3,
    "name": "DATA",
    "users": [
        {
            "userid": 4,
            "username": "admin",
            "primaryemail": "admin@lambdaschool.local",
            "useremails": [
                {
                    "useremailid": 5,
                    "useremail": "admin@email.local"
                },
                {
                    "useremailid": 6,
                    "useremail": "admin@mymail.local"
                }
            ]
        },
        {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "useremails": [
                {
                    "useremailid": 9,
                    "useremail": "favbun@hops.local"
                },
                {
                    "useremailid": 10,
                    "useremail": "bunny@email.local"
                }
            ]
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/roles/role/name/data</summary>

```JSON
{
    "roleid": 3,
    "name": "DATA",
    "users": [
        {
            "userid": 4,
            "username": "admin",
            "primaryemail": "admin@lambdaschool.local",
            "useremails": [
                {
                    "useremailid": 5,
                    "useremail": "admin@email.local"
                },
                {
                    "useremailid": 6,
                    "useremail": "admin@mymail.local"
                }
            ]
        },
        {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "useremails": [
                {
                    "useremailid": 9,
                    "useremail": "favbun@hops.local"
                },
                {
                    "useremailid": 10,
                    "useremail": "bunny@email.local"
                }
            ]
        }
    ]
}
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
Location Header: http://localhost:2019/roles/role/215

Status 201 Created
```

</details>

<details>
<summary>http://localhost:2019/users/users</summary>

```JSON
[
    {
        "userid": 4,
        "username": "admin",
        "primaryemail": "admin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 5,
                "useremail": "admin@email.local"
            },
            {
                "useremailid": 6,
                "useremail": "admin@mymail.local"
            }
        ],
        "roles": [
            {
                "roleid": 1,
                "name": "ADMIN"
            },
            {
                "roleid": 2,
                "name": "USER"
            },
            {
                "roleid": 3,
                "name": "DATA"
            }
        ]
    },
    {
        "userid": 7,
        "username": "cinnamon",
        "primaryemail": "cinnamon@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 9,
                "useremail": "favbun@hops.local"
            },
            {
                "useremailid": 10,
                "useremail": "bunny@email.local"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            },
            {
                "roleid": 3,
                "name": "DATA"
            }
        ]
    },
    {
        "userid": 11,
        "username": "barnbarn",
        "primaryemail": "barnbarn@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 12,
                "useremail": "barnbarn@email.local"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 13,
        "username": "puttat",
        "primaryemail": "puttat@school.lambda",
        "useremails": [],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 14,
        "username": "misskitty",
        "primaryemail": "misskitty@school.lambda",
        "useremails": [],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 15,
        "username": "matilda.yundt",
        "primaryemail": "curt.buckridge@yahoo.com",
        "useremails": [
            {
                "useremailid": 16,
                "useremail": "qgmy80@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 17,
        "username": "dave.rodriguez",
        "primaryemail": "brent.mitchell@gmail.com",
        "useremails": [
            {
                "useremailid": 18,
                "useremail": "xlif03@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 19,
        "username": "denyse.crona",
        "primaryemail": "shala.bahringer@gmail.com",
        "useremails": [
            {
                "useremailid": 20,
                "useremail": "ntjd26@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 21,
        "username": "denis.ritchie",
        "primaryemail": "patience.maggio@yahoo.com",
        "useremails": [
            {
                "useremailid": 22,
                "useremail": "exvp66@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 23,
        "username": "richard.rosenbaum",
        "primaryemail": "humberto.dooley@yahoo.com",
        "useremails": [
            {
                "useremailid": 24,
                "useremail": "rrfd13@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 25,
        "username": "clarence.turner",
        "primaryemail": "edwardo.bashirian@yahoo.com",
        "useremails": [
            {
                "useremailid": 26,
                "useremail": "poov69@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 27,
        "username": "leonel.gaylord",
        "primaryemail": "samual.wisoky@hotmail.com",
        "useremails": [
            {
                "useremailid": 28,
                "useremail": "mpig37@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 29,
        "username": "wayne.turcotte",
        "primaryemail": "earline.oreilly@yahoo.com",
        "useremails": [
            {
                "useremailid": 30,
                "useremail": "bysw47@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 31,
        "username": "elizebeth.johnson",
        "primaryemail": "saturnina.wintheiser@gmail.com",
        "useremails": [
            {
                "useremailid": 32,
                "useremail": "whkb12@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 33,
        "username": "mavis.prohaska",
        "primaryemail": "donovan.heller@yahoo.com",
        "useremails": [
            {
                "useremailid": 34,
                "useremail": "fqlz02@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 35,
        "username": "josef.bode",
        "primaryemail": "seymour.rempel@yahoo.com",
        "useremails": [
            {
                "useremailid": 36,
                "useremail": "ukig45@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 37,
        "username": "jacqui.grady",
        "primaryemail": "mattie.bashirian@gmail.com",
        "useremails": [
            {
                "useremailid": 38,
                "useremail": "wxjz52@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 39,
        "username": "edwardo.mcdermott",
        "primaryemail": "vicky.brown@yahoo.com",
        "useremails": [
            {
                "useremailid": 40,
                "useremail": "bxko72@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 41,
        "username": "rigoberto.koelpin",
        "primaryemail": "simon.heathcote@hotmail.com",
        "useremails": [
            {
                "useremailid": 42,
                "useremail": "etfy55@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 43,
        "username": "celinda.spencer",
        "primaryemail": "priscila.kirlin@yahoo.com",
        "useremails": [
            {
                "useremailid": 44,
                "useremail": "ucph13@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 45,
        "username": "nicolette.baumbach",
        "primaryemail": "garland.ankunding@gmail.com",
        "useremails": [
            {
                "useremailid": 46,
                "useremail": "dgtc18@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 47,
        "username": "willis.rosenbaum",
        "primaryemail": "leonie.kuhic@hotmail.com",
        "useremails": [
            {
                "useremailid": 48,
                "useremail": "wrxx04@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 49,
        "username": "jonas.ondricka",
        "primaryemail": "chris.braun@yahoo.com",
        "useremails": [
            {
                "useremailid": 50,
                "useremail": "dojj12@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 51,
        "username": "lanny.prosacco",
        "primaryemail": "gerardo.okeefe@hotmail.com",
        "useremails": [
            {
                "useremailid": 52,
                "useremail": "bdub60@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 53,
        "username": "lean.lang",
        "primaryemail": "norene.mcglynn@yahoo.com",
        "useremails": [
            {
                "useremailid": 54,
                "useremail": "gkyt77@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 55,
        "username": "caryn.vonrueden",
        "primaryemail": "deena.casper@gmail.com",
        "useremails": [
            {
                "useremailid": 56,
                "useremail": "itbs03@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 57,
        "username": "lavone.douglas",
        "primaryemail": "gordon.pfannerstill@gmail.com",
        "useremails": [
            {
                "useremailid": 58,
                "useremail": "xnpj32@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 59,
        "username": "norbert.gislason",
        "primaryemail": "gaynelle.hintz@hotmail.com",
        "useremails": [
            {
                "useremailid": 60,
                "useremail": "qxdz57@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 61,
        "username": "evon.gottlieb",
        "primaryemail": "shera.botsford@gmail.com",
        "useremails": [
            {
                "useremailid": 62,
                "useremail": "rtqc42@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 63,
        "username": "deon.damore",
        "primaryemail": "xiao.ratke@gmail.com",
        "useremails": [
            {
                "useremailid": 64,
                "useremail": "msim50@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 65,
        "username": "gaylord.kemmer",
        "primaryemail": "bennie.fay@hotmail.com",
        "useremails": [
            {
                "useremailid": 66,
                "useremail": "mdum96@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 67,
        "username": "rick.donnelly",
        "primaryemail": "jana.grimes@yahoo.com",
        "useremails": [
            {
                "useremailid": 68,
                "useremail": "npfn93@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 69,
        "username": "regenia.gislason",
        "primaryemail": "kittie.kub@hotmail.com",
        "useremails": [
            {
                "useremailid": 70,
                "useremail": "zwoa10@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 71,
        "username": "keturah.hirthe",
        "primaryemail": "madelyn.cummerata@yahoo.com",
        "useremails": [
            {
                "useremailid": 72,
                "useremail": "mgru08@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 73,
        "username": "marylyn.schmitt",
        "primaryemail": "wiley.shields@gmail.com",
        "useremails": [
            {
                "useremailid": 74,
                "useremail": "afpj96@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 75,
        "username": "dacia.cole",
        "primaryemail": "gearldine.effertz@yahoo.com",
        "useremails": [
            {
                "useremailid": 76,
                "useremail": "oziz06@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 77,
        "username": "sherita.powlowski",
        "primaryemail": "dallas.quitzon@yahoo.com",
        "useremails": [
            {
                "useremailid": 78,
                "useremail": "zchl69@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 79,
        "username": "iola.nitzsche",
        "primaryemail": "adriene.heathcote@yahoo.com",
        "useremails": [
            {
                "useremailid": 80,
                "useremail": "omiz30@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 81,
        "username": "marcelo.shields",
        "primaryemail": "verlie.macgyver@gmail.com",
        "useremails": [
            {
                "useremailid": 82,
                "useremail": "xvcg63@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 83,
        "username": "dirk.jacobson",
        "primaryemail": "gail.sauer@gmail.com",
        "useremails": [
            {
                "useremailid": 84,
                "useremail": "yssh13@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 85,
        "username": "glinda.bogisich",
        "primaryemail": "susan.altenwerth@gmail.com",
        "useremails": [
            {
                "useremailid": 86,
                "useremail": "ppbf70@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 87,
        "username": "marry.kling",
        "primaryemail": "porter.pacocha@hotmail.com",
        "useremails": [
            {
                "useremailid": 88,
                "useremail": "qzhg91@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 89,
        "username": "socorro.connelly",
        "primaryemail": "suzan.osinski@hotmail.com",
        "useremails": [
            {
                "useremailid": 90,
                "useremail": "olwn04@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 91,
        "username": "edith.greenholt",
        "primaryemail": "alaina.mayert@gmail.com",
        "useremails": [
            {
                "useremailid": 92,
                "useremail": "osvf94@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 93,
        "username": "jacinto.moen",
        "primaryemail": "boyce.jakubowski@gmail.com",
        "useremails": [
            {
                "useremailid": 94,
                "useremail": "jnbm21@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 95,
        "username": "del.gibson",
        "primaryemail": "ronnie.metz@hotmail.com",
        "useremails": [
            {
                "useremailid": 96,
                "useremail": "hcas79@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 97,
        "username": "melvin.braun",
        "primaryemail": "rory.jones@yahoo.com",
        "useremails": [
            {
                "useremailid": 98,
                "useremail": "tuck65@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 99,
        "username": "tory.oreilly",
        "primaryemail": "cody.watsica@hotmail.com",
        "useremails": [
            {
                "useremailid": 100,
                "useremail": "jzvg60@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 101,
        "username": "patria.walker",
        "primaryemail": "claudette.zulauf@gmail.com",
        "useremails": [
            {
                "useremailid": 102,
                "useremail": "iugx85@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 103,
        "username": "august.mante",
        "primaryemail": "isidro.daniel@hotmail.com",
        "useremails": [
            {
                "useremailid": 104,
                "useremail": "hnpq15@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 105,
        "username": "lyndsey.ledner",
        "primaryemail": "dominga.stoltenberg@yahoo.com",
        "useremails": [
            {
                "useremailid": 106,
                "useremail": "nwjb49@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 107,
        "username": "napoleon.farrell",
        "primaryemail": "ashly.prosacco@gmail.com",
        "useremails": [
            {
                "useremailid": 108,
                "useremail": "wrzk27@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 109,
        "username": "rigoberto.douglas",
        "primaryemail": "emilio.rath@gmail.com",
        "useremails": [
            {
                "useremailid": 110,
                "useremail": "msxd77@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 111,
        "username": "william.stehr",
        "primaryemail": "saul.bradtke@hotmail.com",
        "useremails": [
            {
                "useremailid": 112,
                "useremail": "qttt00@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 113,
        "username": "ann.kilback",
        "primaryemail": "gidget.bernier@gmail.com",
        "useremails": [
            {
                "useremailid": 114,
                "useremail": "xfvn58@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 115,
        "username": "vania.ortiz",
        "primaryemail": "roscoe.cartwright@hotmail.com",
        "useremails": [
            {
                "useremailid": 116,
                "useremail": "wspo72@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 117,
        "username": "shauna.walter",
        "primaryemail": "paris.parker@hotmail.com",
        "useremails": [
            {
                "useremailid": 118,
                "useremail": "fgbc05@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 119,
        "username": "rosamond.douglas",
        "primaryemail": "lynwood.schuster@hotmail.com",
        "useremails": [
            {
                "useremailid": 120,
                "useremail": "ekai96@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 121,
        "username": "angela.wintheiser",
        "primaryemail": "sylvie.anderson@yahoo.com",
        "useremails": [
            {
                "useremailid": 122,
                "useremail": "ffkd22@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 123,
        "username": "dulce.koss",
        "primaryemail": "noah.runolfsdottir@hotmail.com",
        "useremails": [
            {
                "useremailid": 124,
                "useremail": "htfj65@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 125,
        "username": "christa.schmidt",
        "primaryemail": "jordan.connelly@yahoo.com",
        "useremails": [
            {
                "useremailid": 126,
                "useremail": "gefm82@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 127,
        "username": "migdalia.ondricka",
        "primaryemail": "davida.hilll@gmail.com",
        "useremails": [
            {
                "useremailid": 128,
                "useremail": "hije89@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 129,
        "username": "blaine.kerluke",
        "primaryemail": "easter.fisher@yahoo.com",
        "useremails": [
            {
                "useremailid": 130,
                "useremail": "lkwm29@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 131,
        "username": "williams.langosh",
        "primaryemail": "vance.brown@yahoo.com",
        "useremails": [
            {
                "useremailid": 132,
                "useremail": "affl03@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 133,
        "username": "agripina.ruecker",
        "primaryemail": "dominga.gorczany@gmail.com",
        "useremails": [
            {
                "useremailid": 134,
                "useremail": "ydij67@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 135,
        "username": "rosetta.mosciski",
        "primaryemail": "jaclyn.williamson@gmail.com",
        "useremails": [
            {
                "useremailid": 136,
                "useremail": "znpf34@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 137,
        "username": "minh.pacocha",
        "primaryemail": "dollie.bechtelar@yahoo.com",
        "useremails": [
            {
                "useremailid": 138,
                "useremail": "ijlc86@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 139,
        "username": "thu.vonrueden",
        "primaryemail": "cherelle.hermiston@gmail.com",
        "useremails": [
            {
                "useremailid": 140,
                "useremail": "xtks93@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 141,
        "username": "ranee.glover",
        "primaryemail": "daryl.brakus@yahoo.com",
        "useremails": [
            {
                "useremailid": 142,
                "useremail": "qilq50@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 143,
        "username": "cody.green",
        "primaryemail": "genna.schuster@gmail.com",
        "useremails": [
            {
                "useremailid": 144,
                "useremail": "olsh71@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 145,
        "username": "dewitt.wehner",
        "primaryemail": "treva.von@gmail.com",
        "useremails": [
            {
                "useremailid": 146,
                "useremail": "sgtd73@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 147,
        "username": "santos.grant",
        "primaryemail": "yi.hahn@gmail.com",
        "useremails": [
            {
                "useremailid": 148,
                "useremail": "wrjq40@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 149,
        "username": "harris.ohara",
        "primaryemail": "ricardo.dubuque@yahoo.com",
        "useremails": [
            {
                "useremailid": 150,
                "useremail": "dzpo34@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 151,
        "username": "eustolia.blanda",
        "primaryemail": "scotty.bashirian@hotmail.com",
        "useremails": [
            {
                "useremailid": 152,
                "useremail": "exyg13@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 153,
        "username": "theodora.gulgowski",
        "primaryemail": "alphonso.quigley@hotmail.com",
        "useremails": [
            {
                "useremailid": 154,
                "useremail": "klfs87@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 155,
        "username": "terrell.heller",
        "primaryemail": "milford.batz@hotmail.com",
        "useremails": [
            {
                "useremailid": 156,
                "useremail": "ugmd90@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 157,
        "username": "aleshia.kub",
        "primaryemail": "augustine.krajcik@hotmail.com",
        "useremails": [
            {
                "useremailid": 158,
                "useremail": "pzat24@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 159,
        "username": "carlo.bruen",
        "primaryemail": "ambrose.lockman@hotmail.com",
        "useremails": [
            {
                "useremailid": 160,
                "useremail": "rwza71@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 161,
        "username": "eli.langworth",
        "primaryemail": "king.bernhard@hotmail.com",
        "useremails": [
            {
                "useremailid": 162,
                "useremail": "mmou49@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 163,
        "username": "christian.schroeder",
        "primaryemail": "santana.stoltenberg@yahoo.com",
        "useremails": [
            {
                "useremailid": 164,
                "useremail": "wrwv26@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 165,
        "username": "lowell.schoen",
        "primaryemail": "evelyne.bechtelar@gmail.com",
        "useremails": [
            {
                "useremailid": 166,
                "useremail": "agxm74@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 167,
        "username": "marinda.hettinger",
        "primaryemail": "rodrick.kirlin@gmail.com",
        "useremails": [
            {
                "useremailid": 168,
                "useremail": "kcrb38@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 169,
        "username": "gustavo.weber",
        "primaryemail": "karine.luettgen@hotmail.com",
        "useremails": [
            {
                "useremailid": 170,
                "useremail": "matj06@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 171,
        "username": "rory.jakubowski",
        "primaryemail": "laureen.walsh@hotmail.com",
        "useremails": [
            {
                "useremailid": 172,
                "useremail": "ejgd15@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 173,
        "username": "mitch.runte",
        "primaryemail": "royal.schaden@hotmail.com",
        "useremails": [
            {
                "useremailid": 174,
                "useremail": "ddyh01@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 175,
        "username": "elton.grady",
        "primaryemail": "savanna.marks@yahoo.com",
        "useremails": [
            {
                "useremailid": 176,
                "useremail": "rsxi82@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 177,
        "username": "cornell.deckow",
        "primaryemail": "britt.hintz@yahoo.com",
        "useremails": [
            {
                "useremailid": 178,
                "useremail": "ezwt57@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 179,
        "username": "carol.beier",
        "primaryemail": "elsie.walsh@yahoo.com",
        "useremails": [
            {
                "useremailid": 180,
                "useremail": "hjvv93@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 181,
        "username": "octavia.heaney",
        "primaryemail": "belia.parker@hotmail.com",
        "useremails": [
            {
                "useremailid": 182,
                "useremail": "xwrk46@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 183,
        "username": "kraig.hand",
        "primaryemail": "syreeta.satterfield@hotmail.com",
        "useremails": [
            {
                "useremailid": 184,
                "useremail": "ylnx08@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 185,
        "username": "moses.hoppe",
        "primaryemail": "brady.friesen@yahoo.com",
        "useremails": [
            {
                "useremailid": 186,
                "useremail": "qeqm63@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 187,
        "username": "ami.windler",
        "primaryemail": "melvin.hudson@yahoo.com",
        "useremails": [
            {
                "useremailid": 188,
                "useremail": "rset43@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 189,
        "username": "andrew.prosacco",
        "primaryemail": "milan.kautzer@hotmail.com",
        "useremails": [
            {
                "useremailid": 190,
                "useremail": "icrz24@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 191,
        "username": "audra.mills",
        "primaryemail": "sarita.herzog@gmail.com",
        "useremails": [
            {
                "useremailid": 192,
                "useremail": "wmkh03@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 193,
        "username": "melony.von",
        "primaryemail": "fern.kautzer@yahoo.com",
        "useremails": [
            {
                "useremailid": 194,
                "useremail": "hrjj76@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 195,
        "username": "renaldo.klocko",
        "primaryemail": "giovanni.beahan@hotmail.com",
        "useremails": [
            {
                "useremailid": 196,
                "useremail": "doev22@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 197,
        "username": "leroy.oconner",
        "primaryemail": "willodean.schmidt@gmail.com",
        "useremails": [
            {
                "useremailid": 198,
                "useremail": "cnvx02@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 199,
        "username": "justin.cassin",
        "primaryemail": "tommy.fisher@hotmail.com",
        "useremails": [
            {
                "useremailid": 200,
                "useremail": "bvlt19@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 201,
        "username": "earleen.braun",
        "primaryemail": "genoveva.effertz@yahoo.com",
        "useremails": [
            {
                "useremailid": 202,
                "useremail": "tbhv64@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 203,
        "username": "iraida.schuppe",
        "primaryemail": "kacey.schaden@yahoo.com",
        "useremails": [
            {
                "useremailid": 204,
                "useremail": "lmqv92@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 205,
        "username": "deshawn.ledner",
        "primaryemail": "veola.king@gmail.com",
        "useremails": [
            {
                "useremailid": 206,
                "useremail": "oaej42@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 207,
        "username": "regenia.cormier",
        "primaryemail": "zachery.hyatt@yahoo.com",
        "useremails": [
            {
                "useremailid": 208,
                "useremail": "ahma01@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 209,
        "username": "arletha.runte",
        "primaryemail": "gerardo.torphy@gmail.com",
        "useremails": [
            {
                "useremailid": 210,
                "useremail": "kwuk73@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 211,
        "username": "sterling.howe",
        "primaryemail": "pete.spinka@gmail.com",
        "useremails": [
            {
                "useremailid": 212,
                "useremail": "hoyu63@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 213,
        "username": "maybell.murray",
        "primaryemail": "brittani.kassulke@gmail.com",
        "useremails": [
            {
                "useremailid": 214,
                "useremail": "gvsw20@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/users/user/7</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "roleid": 2,
            "name": "USER"
        },
        {
            "roleid": 3,
            "name": "DATA"
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/cinnamon</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "roleid": 2,
            "name": "USER"
        },
        {
            "roleid": 3,
            "name": "DATA"
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/like/da</summary>

```JSON
[
    {
        "userid": 15,
        "username": "matilda.yundt",
        "primaryemail": "curt.buckridge@yahoo.com",
        "useremails": [
            {
                "useremailid": 16,
                "useremail": "qgmy80@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 17,
        "username": "dave.rodriguez",
        "primaryemail": "brent.mitchell@gmail.com",
        "useremails": [
            {
                "useremailid": 18,
                "useremail": "xlif03@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 43,
        "username": "celinda.spencer",
        "primaryemail": "priscila.kirlin@yahoo.com",
        "useremails": [
            {
                "useremailid": 44,
                "useremail": "ucph13@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 63,
        "username": "deon.damore",
        "primaryemail": "xiao.ratke@gmail.com",
        "useremails": [
            {
                "useremailid": 64,
                "useremail": "msim50@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 75,
        "username": "dacia.cole",
        "primaryemail": "gearldine.effertz@yahoo.com",
        "useremails": [
            {
                "useremailid": 76,
                "useremail": "oziz06@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 85,
        "username": "glinda.bogisich",
        "primaryemail": "susan.altenwerth@gmail.com",
        "useremails": [
            {
                "useremailid": 86,
                "useremail": "ppbf70@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 127,
        "username": "migdalia.ondricka",
        "primaryemail": "davida.hilll@gmail.com",
        "useremails": [
            {
                "useremailid": 128,
                "useremail": "hije89@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 151,
        "username": "eustolia.blanda",
        "primaryemail": "scotty.bashirian@hotmail.com",
        "useremails": [
            {
                "useremailid": 152,
                "useremail": "exyg13@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 167,
        "username": "marinda.hettinger",
        "primaryemail": "rodrick.kirlin@gmail.com",
        "useremails": [
            {
                "useremailid": 168,
                "useremail": "kcrb38@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    },
    {
        "userid": 203,
        "username": "iraida.schuppe",
        "primaryemail": "kacey.schaden@yahoo.com",
        "useremails": [
            {
                "useremailid": 204,
                "useremail": "lmqv92@gmail.com"
            }
        ],
        "roles": [
            {
                "roleid": 2,
                "name": "USER"
            }
        ]
    }
]
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
Location Header http://localhost:2019/users/user/216

Status 201 Created
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
No Body Data

Status of OK
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
No Body

Status OK
```

</details>

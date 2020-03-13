# Java User Model Initial Version

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the applications data. This application will also form the basis of a user authentication application developed elsewhere in the course

### Database layout

The table layout are as follows

* User is the driving table.
* Useremails have a Many-To-One relationship with User. Each User has many user email combinations. Each user email combination has only one User.
* Roles have a Many-To-Many relationship with Users.

![Image of Database Layout](usersdb.png)

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
        "useremail": "xskw18@gmail.com",
        "user": {
            "userid": 15,
            "username": "sherwood.hoeger",
            "primaryemail": "israel.conroy@gmail.com",
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
        "useremail": "peel65@gmail.com",
        "user": {
            "userid": 17,
            "username": "graciela.stokes",
            "primaryemail": "rolando.hahn@gmail.com",
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
        "useremail": "jwsk46@gmail.com",
        "user": {
            "userid": 19,
            "username": "gilberto.stark",
            "primaryemail": "carmina.franecki@hotmail.com",
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
        "useremail": "lbja57@gmail.com",
        "user": {
            "userid": 21,
            "username": "ronnie.toy",
            "primaryemail": "neal.pfannerstill@yahoo.com",
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
        "useremail": "fqhs75@gmail.com",
        "user": {
            "userid": 23,
            "username": "booker.fritsch",
            "primaryemail": "nelida.hilll@hotmail.com",
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
        "useremail": "pfpj36@gmail.com",
        "user": {
            "userid": 25,
            "username": "clemencia.reinger",
            "primaryemail": "wilson.volkman@gmail.com",
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
        "useremail": "oees90@gmail.com",
        "user": {
            "userid": 27,
            "username": "isabel.satterfield",
            "primaryemail": "michael.sporer@hotmail.com",
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
        "useremail": "bqfh83@gmail.com",
        "user": {
            "userid": 29,
            "username": "peggy.schaden",
            "primaryemail": "ignacio.heidenreich@yahoo.com",
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
        "useremail": "ayjg58@gmail.com",
        "user": {
            "userid": 31,
            "username": "ike.berge",
            "primaryemail": "errol.lynch@yahoo.com",
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
        "useremail": "uias57@gmail.com",
        "user": {
            "userid": 33,
            "username": "wilfred.wolff",
            "primaryemail": "kristofer.mosciski@hotmail.com",
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
        "useremail": "lhvu67@gmail.com",
        "user": {
            "userid": 35,
            "username": "preston.langworth",
            "primaryemail": "jesus.pfannerstill@hotmail.com",
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
        "useremail": "suuh50@gmail.com",
        "user": {
            "userid": 37,
            "username": "candida.harris",
            "primaryemail": "mendy.runolfsson@gmail.com",
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
        "useremail": "cpte79@gmail.com",
        "user": {
            "userid": 39,
            "username": "douglas.kuhn",
            "primaryemail": "gladis.boyle@gmail.com",
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
        "useremail": "eebw20@gmail.com",
        "user": {
            "userid": 41,
            "username": "abbey.oreilly",
            "primaryemail": "ina.zieme@yahoo.com",
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
        "useremail": "yzzr06@gmail.com",
        "user": {
            "userid": 43,
            "username": "eugene.prohaska",
            "primaryemail": "lincoln.johns@gmail.com",
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
        "useremail": "itah03@gmail.com",
        "user": {
            "userid": 45,
            "username": "thaddeus.hermann",
            "primaryemail": "maile.hickle@gmail.com",
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
        "useremail": "luhs65@gmail.com",
        "user": {
            "userid": 47,
            "username": "margarito.schultz",
            "primaryemail": "marisha.schuster@hotmail.com",
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
        "useremail": "fvdv73@gmail.com",
        "user": {
            "userid": 49,
            "username": "hubert.hettinger",
            "primaryemail": "rafael.prosacco@yahoo.com",
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
        "useremail": "dqpv88@gmail.com",
        "user": {
            "userid": 51,
            "username": "francis.osinski",
            "primaryemail": "rolanda.kris@hotmail.com",
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
        "useremail": "ljxx97@gmail.com",
        "user": {
            "userid": 53,
            "username": "korey.mckenzie",
            "primaryemail": "linette.rau@yahoo.com",
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
        "useremail": "aqso45@gmail.com",
        "user": {
            "userid": 55,
            "username": "kelvin.windler",
            "primaryemail": "ian.tremblay@hotmail.com",
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
        "useremail": "opee90@gmail.com",
        "user": {
            "userid": 57,
            "username": "shan.tremblay",
            "primaryemail": "holley.schumm@gmail.com",
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
        "useremail": "qmwa99@gmail.com",
        "user": {
            "userid": 59,
            "username": "michal.ortiz",
            "primaryemail": "chance.okuneva@yahoo.com",
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
        "useremail": "slvj39@gmail.com",
        "user": {
            "userid": 61,
            "username": "richie.hahn",
            "primaryemail": "lana.kiehn@hotmail.com",
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
        "useremail": "tbhv00@gmail.com",
        "user": {
            "userid": 63,
            "username": "hyo.kemmer",
            "primaryemail": "monique.ziemann@gmail.com",
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
        "useremail": "ijic62@gmail.com",
        "user": {
            "userid": 65,
            "username": "jeromy.blanda",
            "primaryemail": "danyel.klein@gmail.com",
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
        "useremail": "cauz68@gmail.com",
        "user": {
            "userid": 67,
            "username": "major.deckow",
            "primaryemail": "lee.breitenberg@hotmail.com",
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
        "useremail": "pcrz93@gmail.com",
        "user": {
            "userid": 69,
            "username": "ileana.von",
            "primaryemail": "pamela.cruickshank@yahoo.com",
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
        "useremail": "tkwi17@gmail.com",
        "user": {
            "userid": 71,
            "username": "liliana.schoen",
            "primaryemail": "bessie.kertzmann@gmail.com",
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
        "useremail": "syda00@gmail.com",
        "user": {
            "userid": 73,
            "username": "kylee.koch",
            "primaryemail": "jerrell.senger@gmail.com",
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
        "useremail": "rdcr08@gmail.com",
        "user": {
            "userid": 75,
            "username": "willian.lubowitz",
            "primaryemail": "cesar.wolff@yahoo.com",
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
        "useremail": "njjk01@gmail.com",
        "user": {
            "userid": 77,
            "username": "jolynn.leuschke",
            "primaryemail": "hong.ritchie@hotmail.com",
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
        "useremail": "xonh59@gmail.com",
        "user": {
            "userid": 79,
            "username": "herbert.connelly",
            "primaryemail": "russel.weimann@hotmail.com",
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
        "useremail": "sylg17@gmail.com",
        "user": {
            "userid": 81,
            "username": "alix.shields",
            "primaryemail": "pedro.wyman@hotmail.com",
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
        "useremail": "vjsa32@gmail.com",
        "user": {
            "userid": 83,
            "username": "maryetta.mcclure",
            "primaryemail": "elden.wolf@gmail.com",
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
        "useremail": "nbdj44@gmail.com",
        "user": {
            "userid": 85,
            "username": "deon.klocko",
            "primaryemail": "monica.brown@hotmail.com",
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
        "useremail": "hlos69@gmail.com",
        "user": {
            "userid": 87,
            "username": "louie.harvey",
            "primaryemail": "jordon.mertz@yahoo.com",
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
        "useremail": "nijw86@gmail.com",
        "user": {
            "userid": 89,
            "username": "mohammed.west",
            "primaryemail": "dotty.torphy@hotmail.com",
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
        "useremail": "qcrt31@gmail.com",
        "user": {
            "userid": 91,
            "username": "rey.kris",
            "primaryemail": "delaine.effertz@yahoo.com",
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
        "useremail": "dxxt37@gmail.com",
        "user": {
            "userid": 93,
            "username": "tameika.hammes",
            "primaryemail": "shawn.wuckert@hotmail.com",
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
        "useremail": "mkvp09@gmail.com",
        "user": {
            "userid": 95,
            "username": "jacqui.swift",
            "primaryemail": "domenic.quitzon@yahoo.com",
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
        "useremail": "dtwi67@gmail.com",
        "user": {
            "userid": 97,
            "username": "jeffie.lesch",
            "primaryemail": "christian.baumbach@gmail.com",
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
        "useremail": "mrxa63@gmail.com",
        "user": {
            "userid": 99,
            "username": "cassi.kessler",
            "primaryemail": "val.grimes@hotmail.com",
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
        "useremail": "grej06@gmail.com",
        "user": {
            "userid": 101,
            "username": "nova.kreiger",
            "primaryemail": "bettye.stehr@gmail.com",
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
        "useremail": "pzug31@gmail.com",
        "user": {
            "userid": 103,
            "username": "tracie.murazik",
            "primaryemail": "libby.tillman@gmail.com",
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
        "useremail": "tnwg50@gmail.com",
        "user": {
            "userid": 105,
            "username": "melvin.white",
            "primaryemail": "micheal.damore@gmail.com",
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
        "useremail": "ytrt21@gmail.com",
        "user": {
            "userid": 107,
            "username": "josh.jacobson",
            "primaryemail": "sarina.krajcik@gmail.com",
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
        "useremail": "dlpn23@gmail.com",
        "user": {
            "userid": 109,
            "username": "bryan.johnston",
            "primaryemail": "gerardo.buckridge@gmail.com",
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
        "useremail": "udmd59@gmail.com",
        "user": {
            "userid": 111,
            "username": "tai.nikolaus",
            "primaryemail": "kendrick.swift@yahoo.com",
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
        "useremail": "wjvs47@gmail.com",
        "user": {
            "userid": 113,
            "username": "julee.leuschke",
            "primaryemail": "katherine.lesch@yahoo.com",
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
        "useremail": "sgid92@gmail.com",
        "user": {
            "userid": 115,
            "username": "leslie.grady",
            "primaryemail": "nan.price@gmail.com",
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
        "useremail": "rxdk99@gmail.com",
        "user": {
            "userid": 117,
            "username": "michale.streich",
            "primaryemail": "murray.treutel@yahoo.com",
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
        "useremail": "xhpt15@gmail.com",
        "user": {
            "userid": 119,
            "username": "cole.champlin",
            "primaryemail": "monique.okon@gmail.com",
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
        "useremail": "zufz39@gmail.com",
        "user": {
            "userid": 121,
            "username": "kyle.nolan",
            "primaryemail": "jean.thiel@hotmail.com",
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
        "useremail": "chbn40@gmail.com",
        "user": {
            "userid": 123,
            "username": "leonardo.mayert",
            "primaryemail": "jamar.nikolaus@hotmail.com",
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
        "useremail": "rwiu57@gmail.com",
        "user": {
            "userid": 125,
            "username": "diego.wilderman",
            "primaryemail": "columbus.dickens@gmail.com",
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
        "useremail": "pvwh19@gmail.com",
        "user": {
            "userid": 127,
            "username": "rebecka.marvin",
            "primaryemail": "jeanene.toy@hotmail.com",
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
        "useremail": "fsrl60@gmail.com",
        "user": {
            "userid": 129,
            "username": "long.king",
            "primaryemail": "shaneka.mohr@hotmail.com",
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
        "useremail": "ianw78@gmail.com",
        "user": {
            "userid": 131,
            "username": "jefferey.doyle",
            "primaryemail": "brittany.medhurst@hotmail.com",
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
        "useremail": "ulhi69@gmail.com",
        "user": {
            "userid": 133,
            "username": "mindi.kuvalis",
            "primaryemail": "rosemarie.considine@gmail.com",
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
        "useremail": "deih16@gmail.com",
        "user": {
            "userid": 135,
            "username": "arnoldo.huels",
            "primaryemail": "buck.luettgen@hotmail.com",
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
        "useremail": "gyqu90@gmail.com",
        "user": {
            "userid": 137,
            "username": "jasper.stroman",
            "primaryemail": "bari.oconner@yahoo.com",
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
        "useremail": "nfjf95@gmail.com",
        "user": {
            "userid": 139,
            "username": "deana.douglas",
            "primaryemail": "vena.lebsack@gmail.com",
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
        "useremail": "urmp38@gmail.com",
        "user": {
            "userid": 141,
            "username": "ligia.funk",
            "primaryemail": "irving.oconnell@gmail.com",
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
        "useremail": "mrxn34@gmail.com",
        "user": {
            "userid": 143,
            "username": "nicky.bartell",
            "primaryemail": "rod.okeefe@gmail.com",
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
        "useremail": "zuhe79@gmail.com",
        "user": {
            "userid": 145,
            "username": "carmelia.grant",
            "primaryemail": "rita.mcclure@hotmail.com",
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
        "useremail": "hzsx15@gmail.com",
        "user": {
            "userid": 147,
            "username": "starla.russel",
            "primaryemail": "johnny.homenick@yahoo.com",
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
        "useremail": "nwya10@gmail.com",
        "user": {
            "userid": 149,
            "username": "lawerence.collier",
            "primaryemail": "walton.cole@hotmail.com",
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
        "useremail": "ewxp13@gmail.com",
        "user": {
            "userid": 151,
            "username": "nu.labadie",
            "primaryemail": "darius.satterfield@gmail.com",
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
        "useremail": "nwdw59@gmail.com",
        "user": {
            "userid": 153,
            "username": "jamaal.feil",
            "primaryemail": "lucius.mueller@gmail.com",
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
        "useremail": "cmio28@gmail.com",
        "user": {
            "userid": 155,
            "username": "prince.champlin",
            "primaryemail": "willis.blanda@hotmail.com",
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
        "useremail": "vosz66@gmail.com",
        "user": {
            "userid": 157,
            "username": "roscoe.stroman",
            "primaryemail": "hilaria.stamm@yahoo.com",
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
        "useremail": "niiy05@gmail.com",
        "user": {
            "userid": 159,
            "username": "valentine.altenwerth",
            "primaryemail": "danilo.crona@hotmail.com",
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
        "useremail": "vwxs01@gmail.com",
        "user": {
            "userid": 161,
            "username": "wally.fahey",
            "primaryemail": "tamekia.dibbert@yahoo.com",
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
        "useremail": "cdtl75@gmail.com",
        "user": {
            "userid": 163,
            "username": "ozzie.renner",
            "primaryemail": "clarence.bashirian@hotmail.com",
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
        "useremail": "uopv29@gmail.com",
        "user": {
            "userid": 165,
            "username": "layne.gibson",
            "primaryemail": "coralie.morar@yahoo.com",
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
        "useremail": "slvh34@gmail.com",
        "user": {
            "userid": 167,
            "username": "dominica.barrows",
            "primaryemail": "carson.haley@yahoo.com",
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
        "useremail": "hkbq09@gmail.com",
        "user": {
            "userid": 169,
            "username": "michale.quitzon",
            "primaryemail": "zane.douglas@hotmail.com",
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
        "useremail": "tjbq79@gmail.com",
        "user": {
            "userid": 171,
            "username": "nenita.jacobi",
            "primaryemail": "adolfo.mosciski@hotmail.com",
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
        "useremail": "vune39@gmail.com",
        "user": {
            "userid": 173,
            "username": "elliott.wunsch",
            "primaryemail": "pedro.hegmann@yahoo.com",
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
        "useremail": "afsy02@gmail.com",
        "user": {
            "userid": 175,
            "username": "karl.goyette",
            "primaryemail": "leighann.dicki@hotmail.com",
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
        "useremail": "xnzf62@gmail.com",
        "user": {
            "userid": 177,
            "username": "brandon.lindgren",
            "primaryemail": "conrad.mccullough@hotmail.com",
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
        "useremail": "oabf43@gmail.com",
        "user": {
            "userid": 179,
            "username": "troy.okeefe",
            "primaryemail": "glinda.gorczany@gmail.com",
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
        "useremail": "pnet77@gmail.com",
        "user": {
            "userid": 181,
            "username": "arletta.schmidt",
            "primaryemail": "myrtie.haley@yahoo.com",
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
        "useremail": "pbjv90@gmail.com",
        "user": {
            "userid": 183,
            "username": "gracie.runolfsson",
            "primaryemail": "quintin.christiansen@yahoo.com",
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
        "useremail": "erah83@gmail.com",
        "user": {
            "userid": 185,
            "username": "herbert.reichel",
            "primaryemail": "victoria.rogahn@gmail.com",
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
        "useremail": "qvut28@gmail.com",
        "user": {
            "userid": 187,
            "username": "alvina.bartell",
            "primaryemail": "shamika.dibbert@gmail.com",
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
        "useremail": "sfpg58@gmail.com",
        "user": {
            "userid": 189,
            "username": "leisa.lowe",
            "primaryemail": "philip.weber@yahoo.com",
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
        "useremail": "zesg59@gmail.com",
        "user": {
            "userid": 191,
            "username": "julio.effertz",
            "primaryemail": "irvin.mante@yahoo.com",
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
        "useremail": "gioy45@gmail.com",
        "user": {
            "userid": 193,
            "username": "dominque.witting",
            "primaryemail": "rene.cassin@hotmail.com",
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
        "useremail": "peom18@gmail.com",
        "user": {
            "userid": 195,
            "username": "daryl.rau",
            "primaryemail": "clotilde.feest@hotmail.com",
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
        "useremail": "ioma44@gmail.com",
        "user": {
            "userid": 197,
            "username": "edwina.ryan",
            "primaryemail": "nickolas.abshire@hotmail.com",
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
        "useremail": "xmqi34@gmail.com",
        "user": {
            "userid": 199,
            "username": "graham.connelly",
            "primaryemail": "jacquline.kassulke@yahoo.com",
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
        "useremail": "kqzy04@gmail.com",
        "user": {
            "userid": 201,
            "username": "millard.stehr",
            "primaryemail": "booker.hickle@gmail.com",
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
        "useremail": "gxul40@gmail.com",
        "user": {
            "userid": 203,
            "username": "cordell.stark",
            "primaryemail": "rutha.lesch@yahoo.com",
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
        "useremail": "ixxf48@gmail.com",
        "user": {
            "userid": 205,
            "username": "diego.bradtke",
            "primaryemail": "aimee.windler@yahoo.com",
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
        "useremail": "xjeb51@gmail.com",
        "user": {
            "userid": 207,
            "username": "johnathon.fritsch",
            "primaryemail": "thao.cassin@gmail.com",
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
        "useremail": "opcw98@gmail.com",
        "user": {
            "userid": 209,
            "username": "alfonzo.ondricka",
            "primaryemail": "illa.grady@gmail.com",
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
        "useremail": "wtwu00@gmail.com",
        "user": {
            "userid": 211,
            "username": "leslie.barrows",
            "primaryemail": "sang.deckow@gmail.com",
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
        "useremail": "kvjb04@gmail.com",
        "user": {
            "userid": 213,
            "username": "jarred.hahn",
            "primaryemail": "jarrod.langosh@hotmail.com",
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
    "timestamp": "2020-03-12T19:35:54.598+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "Useremail with id 8888 Not Found!",
    "trace": "javax.persistence.EntityNotFoundException: Useremail with id 8888 Not Found!\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.lambda$findUseremailById$0(UseremailServiceImpl.java:48)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:408)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.findUseremailById(UseremailServiceImpl.java:48)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$FastClassBySpringCGLIB$$f1b1885e.invoke(<generated>)\n\tat org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:769)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:366)\n\tat org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:99)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:689)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$EnhancerBySpringCGLIB$$4e5b2394.findUseremailById(<generated>)\n\tat com.lambdaschool.usermodel.controllers.UseremailController.getUserEmailById(UseremailController.java:59)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:879)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:634)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:541)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:367)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1639)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:834)\n",
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
<summary>POST http://localhost:2019/useremails/user/15/email/favbun@hops.local</summary>

```TEXT
No Data

Location Header: http://localhost:2019/useremails/useremail/215
Status 201 Created
```

</details>

---

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
                "username": "sherwood.hoeger",
                "primaryemail": "israel.conroy@gmail.com",
                "useremails": [
                    {
                        "useremailid": 16,
                        "useremail": "xskw18@gmail.com"
                    },
                    {
                        "useremailid": 215,
                        "useremail": "favbun@hops.local"
                    }
                ]
            },
            {
                "userid": 17,
                "username": "graciela.stokes",
                "primaryemail": "rolando.hahn@gmail.com",
                "useremails": [
                    {
                        "useremailid": 18,
                        "useremail": "peel65@gmail.com"
                    }
                ]
            },
            {
                "userid": 19,
                "username": "gilberto.stark",
                "primaryemail": "carmina.franecki@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 20,
                        "useremail": "jwsk46@gmail.com"
                    }
                ]
            },
            {
                "userid": 21,
                "username": "ronnie.toy",
                "primaryemail": "neal.pfannerstill@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 22,
                        "useremail": "lbja57@gmail.com"
                    }
                ]
            },
            {
                "userid": 23,
                "username": "booker.fritsch",
                "primaryemail": "nelida.hilll@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 24,
                        "useremail": "fqhs75@gmail.com"
                    }
                ]
            },
            {
                "userid": 25,
                "username": "clemencia.reinger",
                "primaryemail": "wilson.volkman@gmail.com",
                "useremails": [
                    {
                        "useremailid": 26,
                        "useremail": "pfpj36@gmail.com"
                    }
                ]
            },
            {
                "userid": 27,
                "username": "isabel.satterfield",
                "primaryemail": "michael.sporer@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 28,
                        "useremail": "oees90@gmail.com"
                    }
                ]
            },
            {
                "userid": 29,
                "username": "peggy.schaden",
                "primaryemail": "ignacio.heidenreich@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 30,
                        "useremail": "bqfh83@gmail.com"
                    }
                ]
            },
            {
                "userid": 31,
                "username": "ike.berge",
                "primaryemail": "errol.lynch@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 32,
                        "useremail": "ayjg58@gmail.com"
                    }
                ]
            },
            {
                "userid": 33,
                "username": "wilfred.wolff",
                "primaryemail": "kristofer.mosciski@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 34,
                        "useremail": "uias57@gmail.com"
                    }
                ]
            },
            {
                "userid": 35,
                "username": "preston.langworth",
                "primaryemail": "jesus.pfannerstill@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 36,
                        "useremail": "lhvu67@gmail.com"
                    }
                ]
            },
            {
                "userid": 37,
                "username": "candida.harris",
                "primaryemail": "mendy.runolfsson@gmail.com",
                "useremails": [
                    {
                        "useremailid": 38,
                        "useremail": "suuh50@gmail.com"
                    }
                ]
            },
            {
                "userid": 39,
                "username": "douglas.kuhn",
                "primaryemail": "gladis.boyle@gmail.com",
                "useremails": [
                    {
                        "useremailid": 40,
                        "useremail": "cpte79@gmail.com"
                    }
                ]
            },
            {
                "userid": 41,
                "username": "abbey.oreilly",
                "primaryemail": "ina.zieme@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 42,
                        "useremail": "eebw20@gmail.com"
                    }
                ]
            },
            {
                "userid": 43,
                "username": "eugene.prohaska",
                "primaryemail": "lincoln.johns@gmail.com",
                "useremails": [
                    {
                        "useremailid": 44,
                        "useremail": "yzzr06@gmail.com"
                    }
                ]
            },
            {
                "userid": 45,
                "username": "thaddeus.hermann",
                "primaryemail": "maile.hickle@gmail.com",
                "useremails": [
                    {
                        "useremailid": 46,
                        "useremail": "itah03@gmail.com"
                    }
                ]
            },
            {
                "userid": 47,
                "username": "margarito.schultz",
                "primaryemail": "marisha.schuster@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 48,
                        "useremail": "luhs65@gmail.com"
                    }
                ]
            },
            {
                "userid": 49,
                "username": "hubert.hettinger",
                "primaryemail": "rafael.prosacco@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 50,
                        "useremail": "fvdv73@gmail.com"
                    }
                ]
            },
            {
                "userid": 51,
                "username": "francis.osinski",
                "primaryemail": "rolanda.kris@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 52,
                        "useremail": "dqpv88@gmail.com"
                    }
                ]
            },
            {
                "userid": 53,
                "username": "korey.mckenzie",
                "primaryemail": "linette.rau@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 54,
                        "useremail": "ljxx97@gmail.com"
                    }
                ]
            },
            {
                "userid": 55,
                "username": "kelvin.windler",
                "primaryemail": "ian.tremblay@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 56,
                        "useremail": "aqso45@gmail.com"
                    }
                ]
            },
            {
                "userid": 57,
                "username": "shan.tremblay",
                "primaryemail": "holley.schumm@gmail.com",
                "useremails": [
                    {
                        "useremailid": 58,
                        "useremail": "opee90@gmail.com"
                    }
                ]
            },
            {
                "userid": 59,
                "username": "michal.ortiz",
                "primaryemail": "chance.okuneva@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 60,
                        "useremail": "qmwa99@gmail.com"
                    }
                ]
            },
            {
                "userid": 61,
                "username": "richie.hahn",
                "primaryemail": "lana.kiehn@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 62,
                        "useremail": "slvj39@gmail.com"
                    }
                ]
            },
            {
                "userid": 63,
                "username": "hyo.kemmer",
                "primaryemail": "monique.ziemann@gmail.com",
                "useremails": [
                    {
                        "useremailid": 64,
                        "useremail": "tbhv00@gmail.com"
                    }
                ]
            },
            {
                "userid": 65,
                "username": "jeromy.blanda",
                "primaryemail": "danyel.klein@gmail.com",
                "useremails": [
                    {
                        "useremailid": 66,
                        "useremail": "ijic62@gmail.com"
                    }
                ]
            },
            {
                "userid": 67,
                "username": "major.deckow",
                "primaryemail": "lee.breitenberg@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 68,
                        "useremail": "cauz68@gmail.com"
                    }
                ]
            },
            {
                "userid": 69,
                "username": "ileana.von",
                "primaryemail": "pamela.cruickshank@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 70,
                        "useremail": "pcrz93@gmail.com"
                    }
                ]
            },
            {
                "userid": 71,
                "username": "liliana.schoen",
                "primaryemail": "bessie.kertzmann@gmail.com",
                "useremails": [
                    {
                        "useremailid": 72,
                        "useremail": "tkwi17@gmail.com"
                    }
                ]
            },
            {
                "userid": 73,
                "username": "kylee.koch",
                "primaryemail": "jerrell.senger@gmail.com",
                "useremails": [
                    {
                        "useremailid": 74,
                        "useremail": "syda00@gmail.com"
                    }
                ]
            },
            {
                "userid": 75,
                "username": "willian.lubowitz",
                "primaryemail": "cesar.wolff@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 76,
                        "useremail": "rdcr08@gmail.com"
                    }
                ]
            },
            {
                "userid": 77,
                "username": "jolynn.leuschke",
                "primaryemail": "hong.ritchie@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 78,
                        "useremail": "njjk01@gmail.com"
                    }
                ]
            },
            {
                "userid": 79,
                "username": "herbert.connelly",
                "primaryemail": "russel.weimann@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 80,
                        "useremail": "xonh59@gmail.com"
                    }
                ]
            },
            {
                "userid": 81,
                "username": "alix.shields",
                "primaryemail": "pedro.wyman@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 82,
                        "useremail": "sylg17@gmail.com"
                    }
                ]
            },
            {
                "userid": 83,
                "username": "maryetta.mcclure",
                "primaryemail": "elden.wolf@gmail.com",
                "useremails": [
                    {
                        "useremailid": 84,
                        "useremail": "vjsa32@gmail.com"
                    }
                ]
            },
            {
                "userid": 85,
                "username": "deon.klocko",
                "primaryemail": "monica.brown@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 86,
                        "useremail": "nbdj44@gmail.com"
                    }
                ]
            },
            {
                "userid": 87,
                "username": "louie.harvey",
                "primaryemail": "jordon.mertz@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 88,
                        "useremail": "hlos69@gmail.com"
                    }
                ]
            },
            {
                "userid": 89,
                "username": "mohammed.west",
                "primaryemail": "dotty.torphy@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 90,
                        "useremail": "nijw86@gmail.com"
                    }
                ]
            },
            {
                "userid": 91,
                "username": "rey.kris",
                "primaryemail": "delaine.effertz@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 92,
                        "useremail": "qcrt31@gmail.com"
                    }
                ]
            },
            {
                "userid": 93,
                "username": "tameika.hammes",
                "primaryemail": "shawn.wuckert@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 94,
                        "useremail": "dxxt37@gmail.com"
                    }
                ]
            },
            {
                "userid": 95,
                "username": "jacqui.swift",
                "primaryemail": "domenic.quitzon@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 96,
                        "useremail": "mkvp09@gmail.com"
                    }
                ]
            },
            {
                "userid": 97,
                "username": "jeffie.lesch",
                "primaryemail": "christian.baumbach@gmail.com",
                "useremails": [
                    {
                        "useremailid": 98,
                        "useremail": "dtwi67@gmail.com"
                    }
                ]
            },
            {
                "userid": 99,
                "username": "cassi.kessler",
                "primaryemail": "val.grimes@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 100,
                        "useremail": "mrxa63@gmail.com"
                    }
                ]
            },
            {
                "userid": 101,
                "username": "nova.kreiger",
                "primaryemail": "bettye.stehr@gmail.com",
                "useremails": [
                    {
                        "useremailid": 102,
                        "useremail": "grej06@gmail.com"
                    }
                ]
            },
            {
                "userid": 103,
                "username": "tracie.murazik",
                "primaryemail": "libby.tillman@gmail.com",
                "useremails": [
                    {
                        "useremailid": 104,
                        "useremail": "pzug31@gmail.com"
                    }
                ]
            },
            {
                "userid": 105,
                "username": "melvin.white",
                "primaryemail": "micheal.damore@gmail.com",
                "useremails": [
                    {
                        "useremailid": 106,
                        "useremail": "tnwg50@gmail.com"
                    }
                ]
            },
            {
                "userid": 107,
                "username": "josh.jacobson",
                "primaryemail": "sarina.krajcik@gmail.com",
                "useremails": [
                    {
                        "useremailid": 108,
                        "useremail": "ytrt21@gmail.com"
                    }
                ]
            },
            {
                "userid": 109,
                "username": "bryan.johnston",
                "primaryemail": "gerardo.buckridge@gmail.com",
                "useremails": [
                    {
                        "useremailid": 110,
                        "useremail": "dlpn23@gmail.com"
                    }
                ]
            },
            {
                "userid": 111,
                "username": "tai.nikolaus",
                "primaryemail": "kendrick.swift@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 112,
                        "useremail": "udmd59@gmail.com"
                    }
                ]
            },
            {
                "userid": 113,
                "username": "julee.leuschke",
                "primaryemail": "katherine.lesch@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 114,
                        "useremail": "wjvs47@gmail.com"
                    }
                ]
            },
            {
                "userid": 115,
                "username": "leslie.grady",
                "primaryemail": "nan.price@gmail.com",
                "useremails": [
                    {
                        "useremailid": 116,
                        "useremail": "sgid92@gmail.com"
                    }
                ]
            },
            {
                "userid": 117,
                "username": "michale.streich",
                "primaryemail": "murray.treutel@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 118,
                        "useremail": "rxdk99@gmail.com"
                    }
                ]
            },
            {
                "userid": 119,
                "username": "cole.champlin",
                "primaryemail": "monique.okon@gmail.com",
                "useremails": [
                    {
                        "useremailid": 120,
                        "useremail": "xhpt15@gmail.com"
                    }
                ]
            },
            {
                "userid": 121,
                "username": "kyle.nolan",
                "primaryemail": "jean.thiel@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 122,
                        "useremail": "zufz39@gmail.com"
                    }
                ]
            },
            {
                "userid": 123,
                "username": "leonardo.mayert",
                "primaryemail": "jamar.nikolaus@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 124,
                        "useremail": "chbn40@gmail.com"
                    }
                ]
            },
            {
                "userid": 125,
                "username": "diego.wilderman",
                "primaryemail": "columbus.dickens@gmail.com",
                "useremails": [
                    {
                        "useremailid": 126,
                        "useremail": "rwiu57@gmail.com"
                    }
                ]
            },
            {
                "userid": 127,
                "username": "rebecka.marvin",
                "primaryemail": "jeanene.toy@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 128,
                        "useremail": "pvwh19@gmail.com"
                    }
                ]
            },
            {
                "userid": 129,
                "username": "long.king",
                "primaryemail": "shaneka.mohr@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 130,
                        "useremail": "fsrl60@gmail.com"
                    }
                ]
            },
            {
                "userid": 131,
                "username": "jefferey.doyle",
                "primaryemail": "brittany.medhurst@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 132,
                        "useremail": "ianw78@gmail.com"
                    }
                ]
            },
            {
                "userid": 133,
                "username": "mindi.kuvalis",
                "primaryemail": "rosemarie.considine@gmail.com",
                "useremails": [
                    {
                        "useremailid": 134,
                        "useremail": "ulhi69@gmail.com"
                    }
                ]
            },
            {
                "userid": 135,
                "username": "arnoldo.huels",
                "primaryemail": "buck.luettgen@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 136,
                        "useremail": "deih16@gmail.com"
                    }
                ]
            },
            {
                "userid": 137,
                "username": "jasper.stroman",
                "primaryemail": "bari.oconner@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 138,
                        "useremail": "gyqu90@gmail.com"
                    }
                ]
            },
            {
                "userid": 139,
                "username": "deana.douglas",
                "primaryemail": "vena.lebsack@gmail.com",
                "useremails": [
                    {
                        "useremailid": 140,
                        "useremail": "nfjf95@gmail.com"
                    }
                ]
            },
            {
                "userid": 141,
                "username": "ligia.funk",
                "primaryemail": "irving.oconnell@gmail.com",
                "useremails": [
                    {
                        "useremailid": 142,
                        "useremail": "urmp38@gmail.com"
                    }
                ]
            },
            {
                "userid": 143,
                "username": "nicky.bartell",
                "primaryemail": "rod.okeefe@gmail.com",
                "useremails": [
                    {
                        "useremailid": 144,
                        "useremail": "mrxn34@gmail.com"
                    }
                ]
            },
            {
                "userid": 145,
                "username": "carmelia.grant",
                "primaryemail": "rita.mcclure@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 146,
                        "useremail": "zuhe79@gmail.com"
                    }
                ]
            },
            {
                "userid": 147,
                "username": "starla.russel",
                "primaryemail": "johnny.homenick@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 148,
                        "useremail": "hzsx15@gmail.com"
                    }
                ]
            },
            {
                "userid": 149,
                "username": "lawerence.collier",
                "primaryemail": "walton.cole@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 150,
                        "useremail": "nwya10@gmail.com"
                    }
                ]
            },
            {
                "userid": 151,
                "username": "nu.labadie",
                "primaryemail": "darius.satterfield@gmail.com",
                "useremails": [
                    {
                        "useremailid": 152,
                        "useremail": "ewxp13@gmail.com"
                    }
                ]
            },
            {
                "userid": 153,
                "username": "jamaal.feil",
                "primaryemail": "lucius.mueller@gmail.com",
                "useremails": [
                    {
                        "useremailid": 154,
                        "useremail": "nwdw59@gmail.com"
                    }
                ]
            },
            {
                "userid": 155,
                "username": "prince.champlin",
                "primaryemail": "willis.blanda@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 156,
                        "useremail": "cmio28@gmail.com"
                    }
                ]
            },
            {
                "userid": 157,
                "username": "roscoe.stroman",
                "primaryemail": "hilaria.stamm@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 158,
                        "useremail": "vosz66@gmail.com"
                    }
                ]
            },
            {
                "userid": 159,
                "username": "valentine.altenwerth",
                "primaryemail": "danilo.crona@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 160,
                        "useremail": "niiy05@gmail.com"
                    }
                ]
            },
            {
                "userid": 161,
                "username": "wally.fahey",
                "primaryemail": "tamekia.dibbert@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 162,
                        "useremail": "vwxs01@gmail.com"
                    }
                ]
            },
            {
                "userid": 163,
                "username": "ozzie.renner",
                "primaryemail": "clarence.bashirian@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 164,
                        "useremail": "cdtl75@gmail.com"
                    }
                ]
            },
            {
                "userid": 165,
                "username": "layne.gibson",
                "primaryemail": "coralie.morar@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 166,
                        "useremail": "uopv29@gmail.com"
                    }
                ]
            },
            {
                "userid": 167,
                "username": "dominica.barrows",
                "primaryemail": "carson.haley@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 168,
                        "useremail": "slvh34@gmail.com"
                    }
                ]
            },
            {
                "userid": 169,
                "username": "michale.quitzon",
                "primaryemail": "zane.douglas@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 170,
                        "useremail": "hkbq09@gmail.com"
                    }
                ]
            },
            {
                "userid": 171,
                "username": "nenita.jacobi",
                "primaryemail": "adolfo.mosciski@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 172,
                        "useremail": "tjbq79@gmail.com"
                    }
                ]
            },
            {
                "userid": 173,
                "username": "elliott.wunsch",
                "primaryemail": "pedro.hegmann@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 174,
                        "useremail": "vune39@gmail.com"
                    }
                ]
            },
            {
                "userid": 175,
                "username": "karl.goyette",
                "primaryemail": "leighann.dicki@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 176,
                        "useremail": "afsy02@gmail.com"
                    }
                ]
            },
            {
                "userid": 177,
                "username": "brandon.lindgren",
                "primaryemail": "conrad.mccullough@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 178,
                        "useremail": "xnzf62@gmail.com"
                    }
                ]
            },
            {
                "userid": 179,
                "username": "troy.okeefe",
                "primaryemail": "glinda.gorczany@gmail.com",
                "useremails": [
                    {
                        "useremailid": 180,
                        "useremail": "oabf43@gmail.com"
                    }
                ]
            },
            {
                "userid": 181,
                "username": "arletta.schmidt",
                "primaryemail": "myrtie.haley@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 182,
                        "useremail": "pnet77@gmail.com"
                    }
                ]
            },
            {
                "userid": 183,
                "username": "gracie.runolfsson",
                "primaryemail": "quintin.christiansen@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 184,
                        "useremail": "pbjv90@gmail.com"
                    }
                ]
            },
            {
                "userid": 185,
                "username": "herbert.reichel",
                "primaryemail": "victoria.rogahn@gmail.com",
                "useremails": [
                    {
                        "useremailid": 186,
                        "useremail": "erah83@gmail.com"
                    }
                ]
            },
            {
                "userid": 187,
                "username": "alvina.bartell",
                "primaryemail": "shamika.dibbert@gmail.com",
                "useremails": [
                    {
                        "useremailid": 188,
                        "useremail": "qvut28@gmail.com"
                    }
                ]
            },
            {
                "userid": 189,
                "username": "leisa.lowe",
                "primaryemail": "philip.weber@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 190,
                        "useremail": "sfpg58@gmail.com"
                    }
                ]
            },
            {
                "userid": 191,
                "username": "julio.effertz",
                "primaryemail": "irvin.mante@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 192,
                        "useremail": "zesg59@gmail.com"
                    }
                ]
            },
            {
                "userid": 193,
                "username": "dominque.witting",
                "primaryemail": "rene.cassin@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 194,
                        "useremail": "gioy45@gmail.com"
                    }
                ]
            },
            {
                "userid": 195,
                "username": "daryl.rau",
                "primaryemail": "clotilde.feest@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 196,
                        "useremail": "peom18@gmail.com"
                    }
                ]
            },
            {
                "userid": 197,
                "username": "edwina.ryan",
                "primaryemail": "nickolas.abshire@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 198,
                        "useremail": "ioma44@gmail.com"
                    }
                ]
            },
            {
                "userid": 199,
                "username": "graham.connelly",
                "primaryemail": "jacquline.kassulke@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 200,
                        "useremail": "xmqi34@gmail.com"
                    }
                ]
            },
            {
                "userid": 201,
                "username": "millard.stehr",
                "primaryemail": "booker.hickle@gmail.com",
                "useremails": [
                    {
                        "useremailid": 202,
                        "useremail": "kqzy04@gmail.com"
                    }
                ]
            },
            {
                "userid": 203,
                "username": "cordell.stark",
                "primaryemail": "rutha.lesch@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 204,
                        "useremail": "gxul40@gmail.com"
                    }
                ]
            },
            {
                "userid": 205,
                "username": "diego.bradtke",
                "primaryemail": "aimee.windler@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 206,
                        "useremail": "ixxf48@gmail.com"
                    }
                ]
            },
            {
                "userid": 207,
                "username": "johnathon.fritsch",
                "primaryemail": "thao.cassin@gmail.com",
                "useremails": [
                    {
                        "useremailid": 208,
                        "useremail": "xjeb51@gmail.com"
                    }
                ]
            },
            {
                "userid": 209,
                "username": "alfonzo.ondricka",
                "primaryemail": "illa.grady@gmail.com",
                "useremails": [
                    {
                        "useremailid": 210,
                        "useremail": "opcw98@gmail.com"
                    }
                ]
            },
            {
                "userid": 211,
                "username": "leslie.barrows",
                "primaryemail": "sang.deckow@gmail.com",
                "useremails": [
                    {
                        "useremailid": 212,
                        "useremail": "wtwu00@gmail.com"
                    }
                ]
            },
            {
                "userid": 213,
                "username": "jarred.hahn",
                "primaryemail": "jarrod.langosh@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 214,
                        "useremail": "kvjb04@gmail.com"
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
                    "useremailid": 8,
                    "useremail": "cinnamon@mymail.local"
                },
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
                    "useremailid": 8,
                    "useremail": "cinnamon@mymail.local"
                },
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
No Data

Location Header: http://localhost:2019/roles/role/216
Status 201 Created
```

</details>

<details>
<summary>DELETE Roles must wait. We can only delete from the main class, in our case User</summary>

</details>

<details>

<summary>PUT / PATCH roles is a custom query added later</summary>
</details>

---

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
        "username": "sherwood.hoeger",
        "primaryemail": "israel.conroy@gmail.com",
        "useremails": [
            {
                "useremailid": 16,
                "useremail": "xskw18@gmail.com"
            },
            {
                "useremailid": 215,
                "useremail": "favbun@hops.local"
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
        "username": "graciela.stokes",
        "primaryemail": "rolando.hahn@gmail.com",
        "useremails": [
            {
                "useremailid": 18,
                "useremail": "peel65@gmail.com"
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
        "username": "gilberto.stark",
        "primaryemail": "carmina.franecki@hotmail.com",
        "useremails": [
            {
                "useremailid": 20,
                "useremail": "jwsk46@gmail.com"
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
        "username": "ronnie.toy",
        "primaryemail": "neal.pfannerstill@yahoo.com",
        "useremails": [
            {
                "useremailid": 22,
                "useremail": "lbja57@gmail.com"
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
        "username": "booker.fritsch",
        "primaryemail": "nelida.hilll@hotmail.com",
        "useremails": [
            {
                "useremailid": 24,
                "useremail": "fqhs75@gmail.com"
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
        "username": "clemencia.reinger",
        "primaryemail": "wilson.volkman@gmail.com",
        "useremails": [
            {
                "useremailid": 26,
                "useremail": "pfpj36@gmail.com"
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
        "username": "isabel.satterfield",
        "primaryemail": "michael.sporer@hotmail.com",
        "useremails": [
            {
                "useremailid": 28,
                "useremail": "oees90@gmail.com"
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
        "username": "peggy.schaden",
        "primaryemail": "ignacio.heidenreich@yahoo.com",
        "useremails": [
            {
                "useremailid": 30,
                "useremail": "bqfh83@gmail.com"
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
        "username": "ike.berge",
        "primaryemail": "errol.lynch@yahoo.com",
        "useremails": [
            {
                "useremailid": 32,
                "useremail": "ayjg58@gmail.com"
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
        "username": "wilfred.wolff",
        "primaryemail": "kristofer.mosciski@hotmail.com",
        "useremails": [
            {
                "useremailid": 34,
                "useremail": "uias57@gmail.com"
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
        "username": "preston.langworth",
        "primaryemail": "jesus.pfannerstill@hotmail.com",
        "useremails": [
            {
                "useremailid": 36,
                "useremail": "lhvu67@gmail.com"
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
        "username": "candida.harris",
        "primaryemail": "mendy.runolfsson@gmail.com",
        "useremails": [
            {
                "useremailid": 38,
                "useremail": "suuh50@gmail.com"
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
        "username": "douglas.kuhn",
        "primaryemail": "gladis.boyle@gmail.com",
        "useremails": [
            {
                "useremailid": 40,
                "useremail": "cpte79@gmail.com"
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
        "username": "abbey.oreilly",
        "primaryemail": "ina.zieme@yahoo.com",
        "useremails": [
            {
                "useremailid": 42,
                "useremail": "eebw20@gmail.com"
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
        "username": "eugene.prohaska",
        "primaryemail": "lincoln.johns@gmail.com",
        "useremails": [
            {
                "useremailid": 44,
                "useremail": "yzzr06@gmail.com"
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
        "username": "thaddeus.hermann",
        "primaryemail": "maile.hickle@gmail.com",
        "useremails": [
            {
                "useremailid": 46,
                "useremail": "itah03@gmail.com"
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
        "username": "margarito.schultz",
        "primaryemail": "marisha.schuster@hotmail.com",
        "useremails": [
            {
                "useremailid": 48,
                "useremail": "luhs65@gmail.com"
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
        "username": "hubert.hettinger",
        "primaryemail": "rafael.prosacco@yahoo.com",
        "useremails": [
            {
                "useremailid": 50,
                "useremail": "fvdv73@gmail.com"
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
        "username": "francis.osinski",
        "primaryemail": "rolanda.kris@hotmail.com",
        "useremails": [
            {
                "useremailid": 52,
                "useremail": "dqpv88@gmail.com"
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
        "username": "korey.mckenzie",
        "primaryemail": "linette.rau@yahoo.com",
        "useremails": [
            {
                "useremailid": 54,
                "useremail": "ljxx97@gmail.com"
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
        "username": "kelvin.windler",
        "primaryemail": "ian.tremblay@hotmail.com",
        "useremails": [
            {
                "useremailid": 56,
                "useremail": "aqso45@gmail.com"
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
        "username": "shan.tremblay",
        "primaryemail": "holley.schumm@gmail.com",
        "useremails": [
            {
                "useremailid": 58,
                "useremail": "opee90@gmail.com"
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
        "username": "michal.ortiz",
        "primaryemail": "chance.okuneva@yahoo.com",
        "useremails": [
            {
                "useremailid": 60,
                "useremail": "qmwa99@gmail.com"
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
        "username": "richie.hahn",
        "primaryemail": "lana.kiehn@hotmail.com",
        "useremails": [
            {
                "useremailid": 62,
                "useremail": "slvj39@gmail.com"
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
        "username": "hyo.kemmer",
        "primaryemail": "monique.ziemann@gmail.com",
        "useremails": [
            {
                "useremailid": 64,
                "useremail": "tbhv00@gmail.com"
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
        "username": "jeromy.blanda",
        "primaryemail": "danyel.klein@gmail.com",
        "useremails": [
            {
                "useremailid": 66,
                "useremail": "ijic62@gmail.com"
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
        "username": "major.deckow",
        "primaryemail": "lee.breitenberg@hotmail.com",
        "useremails": [
            {
                "useremailid": 68,
                "useremail": "cauz68@gmail.com"
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
        "username": "ileana.von",
        "primaryemail": "pamela.cruickshank@yahoo.com",
        "useremails": [
            {
                "useremailid": 70,
                "useremail": "pcrz93@gmail.com"
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
        "username": "liliana.schoen",
        "primaryemail": "bessie.kertzmann@gmail.com",
        "useremails": [
            {
                "useremailid": 72,
                "useremail": "tkwi17@gmail.com"
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
        "username": "kylee.koch",
        "primaryemail": "jerrell.senger@gmail.com",
        "useremails": [
            {
                "useremailid": 74,
                "useremail": "syda00@gmail.com"
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
        "username": "willian.lubowitz",
        "primaryemail": "cesar.wolff@yahoo.com",
        "useremails": [
            {
                "useremailid": 76,
                "useremail": "rdcr08@gmail.com"
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
        "username": "jolynn.leuschke",
        "primaryemail": "hong.ritchie@hotmail.com",
        "useremails": [
            {
                "useremailid": 78,
                "useremail": "njjk01@gmail.com"
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
        "username": "herbert.connelly",
        "primaryemail": "russel.weimann@hotmail.com",
        "useremails": [
            {
                "useremailid": 80,
                "useremail": "xonh59@gmail.com"
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
        "username": "alix.shields",
        "primaryemail": "pedro.wyman@hotmail.com",
        "useremails": [
            {
                "useremailid": 82,
                "useremail": "sylg17@gmail.com"
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
        "username": "maryetta.mcclure",
        "primaryemail": "elden.wolf@gmail.com",
        "useremails": [
            {
                "useremailid": 84,
                "useremail": "vjsa32@gmail.com"
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
        "username": "deon.klocko",
        "primaryemail": "monica.brown@hotmail.com",
        "useremails": [
            {
                "useremailid": 86,
                "useremail": "nbdj44@gmail.com"
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
        "username": "louie.harvey",
        "primaryemail": "jordon.mertz@yahoo.com",
        "useremails": [
            {
                "useremailid": 88,
                "useremail": "hlos69@gmail.com"
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
        "username": "mohammed.west",
        "primaryemail": "dotty.torphy@hotmail.com",
        "useremails": [
            {
                "useremailid": 90,
                "useremail": "nijw86@gmail.com"
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
        "username": "rey.kris",
        "primaryemail": "delaine.effertz@yahoo.com",
        "useremails": [
            {
                "useremailid": 92,
                "useremail": "qcrt31@gmail.com"
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
        "username": "tameika.hammes",
        "primaryemail": "shawn.wuckert@hotmail.com",
        "useremails": [
            {
                "useremailid": 94,
                "useremail": "dxxt37@gmail.com"
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
        "username": "jacqui.swift",
        "primaryemail": "domenic.quitzon@yahoo.com",
        "useremails": [
            {
                "useremailid": 96,
                "useremail": "mkvp09@gmail.com"
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
        "username": "jeffie.lesch",
        "primaryemail": "christian.baumbach@gmail.com",
        "useremails": [
            {
                "useremailid": 98,
                "useremail": "dtwi67@gmail.com"
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
        "username": "cassi.kessler",
        "primaryemail": "val.grimes@hotmail.com",
        "useremails": [
            {
                "useremailid": 100,
                "useremail": "mrxa63@gmail.com"
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
        "username": "nova.kreiger",
        "primaryemail": "bettye.stehr@gmail.com",
        "useremails": [
            {
                "useremailid": 102,
                "useremail": "grej06@gmail.com"
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
        "username": "tracie.murazik",
        "primaryemail": "libby.tillman@gmail.com",
        "useremails": [
            {
                "useremailid": 104,
                "useremail": "pzug31@gmail.com"
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
        "username": "melvin.white",
        "primaryemail": "micheal.damore@gmail.com",
        "useremails": [
            {
                "useremailid": 106,
                "useremail": "tnwg50@gmail.com"
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
        "username": "josh.jacobson",
        "primaryemail": "sarina.krajcik@gmail.com",
        "useremails": [
            {
                "useremailid": 108,
                "useremail": "ytrt21@gmail.com"
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
        "username": "bryan.johnston",
        "primaryemail": "gerardo.buckridge@gmail.com",
        "useremails": [
            {
                "useremailid": 110,
                "useremail": "dlpn23@gmail.com"
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
        "username": "tai.nikolaus",
        "primaryemail": "kendrick.swift@yahoo.com",
        "useremails": [
            {
                "useremailid": 112,
                "useremail": "udmd59@gmail.com"
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
        "username": "julee.leuschke",
        "primaryemail": "katherine.lesch@yahoo.com",
        "useremails": [
            {
                "useremailid": 114,
                "useremail": "wjvs47@gmail.com"
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
        "username": "leslie.grady",
        "primaryemail": "nan.price@gmail.com",
        "useremails": [
            {
                "useremailid": 116,
                "useremail": "sgid92@gmail.com"
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
        "username": "michale.streich",
        "primaryemail": "murray.treutel@yahoo.com",
        "useremails": [
            {
                "useremailid": 118,
                "useremail": "rxdk99@gmail.com"
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
        "username": "cole.champlin",
        "primaryemail": "monique.okon@gmail.com",
        "useremails": [
            {
                "useremailid": 120,
                "useremail": "xhpt15@gmail.com"
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
        "username": "kyle.nolan",
        "primaryemail": "jean.thiel@hotmail.com",
        "useremails": [
            {
                "useremailid": 122,
                "useremail": "zufz39@gmail.com"
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
        "username": "leonardo.mayert",
        "primaryemail": "jamar.nikolaus@hotmail.com",
        "useremails": [
            {
                "useremailid": 124,
                "useremail": "chbn40@gmail.com"
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
        "username": "diego.wilderman",
        "primaryemail": "columbus.dickens@gmail.com",
        "useremails": [
            {
                "useremailid": 126,
                "useremail": "rwiu57@gmail.com"
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
        "username": "rebecka.marvin",
        "primaryemail": "jeanene.toy@hotmail.com",
        "useremails": [
            {
                "useremailid": 128,
                "useremail": "pvwh19@gmail.com"
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
        "username": "long.king",
        "primaryemail": "shaneka.mohr@hotmail.com",
        "useremails": [
            {
                "useremailid": 130,
                "useremail": "fsrl60@gmail.com"
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
        "username": "jefferey.doyle",
        "primaryemail": "brittany.medhurst@hotmail.com",
        "useremails": [
            {
                "useremailid": 132,
                "useremail": "ianw78@gmail.com"
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
        "username": "mindi.kuvalis",
        "primaryemail": "rosemarie.considine@gmail.com",
        "useremails": [
            {
                "useremailid": 134,
                "useremail": "ulhi69@gmail.com"
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
        "username": "arnoldo.huels",
        "primaryemail": "buck.luettgen@hotmail.com",
        "useremails": [
            {
                "useremailid": 136,
                "useremail": "deih16@gmail.com"
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
        "username": "jasper.stroman",
        "primaryemail": "bari.oconner@yahoo.com",
        "useremails": [
            {
                "useremailid": 138,
                "useremail": "gyqu90@gmail.com"
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
        "username": "deana.douglas",
        "primaryemail": "vena.lebsack@gmail.com",
        "useremails": [
            {
                "useremailid": 140,
                "useremail": "nfjf95@gmail.com"
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
        "username": "ligia.funk",
        "primaryemail": "irving.oconnell@gmail.com",
        "useremails": [
            {
                "useremailid": 142,
                "useremail": "urmp38@gmail.com"
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
        "username": "nicky.bartell",
        "primaryemail": "rod.okeefe@gmail.com",
        "useremails": [
            {
                "useremailid": 144,
                "useremail": "mrxn34@gmail.com"
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
        "username": "carmelia.grant",
        "primaryemail": "rita.mcclure@hotmail.com",
        "useremails": [
            {
                "useremailid": 146,
                "useremail": "zuhe79@gmail.com"
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
        "username": "starla.russel",
        "primaryemail": "johnny.homenick@yahoo.com",
        "useremails": [
            {
                "useremailid": 148,
                "useremail": "hzsx15@gmail.com"
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
        "username": "lawerence.collier",
        "primaryemail": "walton.cole@hotmail.com",
        "useremails": [
            {
                "useremailid": 150,
                "useremail": "nwya10@gmail.com"
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
        "username": "nu.labadie",
        "primaryemail": "darius.satterfield@gmail.com",
        "useremails": [
            {
                "useremailid": 152,
                "useremail": "ewxp13@gmail.com"
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
        "username": "jamaal.feil",
        "primaryemail": "lucius.mueller@gmail.com",
        "useremails": [
            {
                "useremailid": 154,
                "useremail": "nwdw59@gmail.com"
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
        "username": "prince.champlin",
        "primaryemail": "willis.blanda@hotmail.com",
        "useremails": [
            {
                "useremailid": 156,
                "useremail": "cmio28@gmail.com"
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
        "username": "roscoe.stroman",
        "primaryemail": "hilaria.stamm@yahoo.com",
        "useremails": [
            {
                "useremailid": 158,
                "useremail": "vosz66@gmail.com"
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
        "username": "valentine.altenwerth",
        "primaryemail": "danilo.crona@hotmail.com",
        "useremails": [
            {
                "useremailid": 160,
                "useremail": "niiy05@gmail.com"
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
        "username": "wally.fahey",
        "primaryemail": "tamekia.dibbert@yahoo.com",
        "useremails": [
            {
                "useremailid": 162,
                "useremail": "vwxs01@gmail.com"
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
        "username": "ozzie.renner",
        "primaryemail": "clarence.bashirian@hotmail.com",
        "useremails": [
            {
                "useremailid": 164,
                "useremail": "cdtl75@gmail.com"
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
        "username": "layne.gibson",
        "primaryemail": "coralie.morar@yahoo.com",
        "useremails": [
            {
                "useremailid": 166,
                "useremail": "uopv29@gmail.com"
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
        "username": "dominica.barrows",
        "primaryemail": "carson.haley@yahoo.com",
        "useremails": [
            {
                "useremailid": 168,
                "useremail": "slvh34@gmail.com"
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
        "username": "michale.quitzon",
        "primaryemail": "zane.douglas@hotmail.com",
        "useremails": [
            {
                "useremailid": 170,
                "useremail": "hkbq09@gmail.com"
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
        "username": "nenita.jacobi",
        "primaryemail": "adolfo.mosciski@hotmail.com",
        "useremails": [
            {
                "useremailid": 172,
                "useremail": "tjbq79@gmail.com"
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
        "username": "elliott.wunsch",
        "primaryemail": "pedro.hegmann@yahoo.com",
        "useremails": [
            {
                "useremailid": 174,
                "useremail": "vune39@gmail.com"
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
        "username": "karl.goyette",
        "primaryemail": "leighann.dicki@hotmail.com",
        "useremails": [
            {
                "useremailid": 176,
                "useremail": "afsy02@gmail.com"
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
        "username": "brandon.lindgren",
        "primaryemail": "conrad.mccullough@hotmail.com",
        "useremails": [
            {
                "useremailid": 178,
                "useremail": "xnzf62@gmail.com"
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
        "username": "troy.okeefe",
        "primaryemail": "glinda.gorczany@gmail.com",
        "useremails": [
            {
                "useremailid": 180,
                "useremail": "oabf43@gmail.com"
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
        "username": "arletta.schmidt",
        "primaryemail": "myrtie.haley@yahoo.com",
        "useremails": [
            {
                "useremailid": 182,
                "useremail": "pnet77@gmail.com"
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
        "username": "gracie.runolfsson",
        "primaryemail": "quintin.christiansen@yahoo.com",
        "useremails": [
            {
                "useremailid": 184,
                "useremail": "pbjv90@gmail.com"
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
        "username": "herbert.reichel",
        "primaryemail": "victoria.rogahn@gmail.com",
        "useremails": [
            {
                "useremailid": 186,
                "useremail": "erah83@gmail.com"
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
        "username": "alvina.bartell",
        "primaryemail": "shamika.dibbert@gmail.com",
        "useremails": [
            {
                "useremailid": 188,
                "useremail": "qvut28@gmail.com"
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
        "username": "leisa.lowe",
        "primaryemail": "philip.weber@yahoo.com",
        "useremails": [
            {
                "useremailid": 190,
                "useremail": "sfpg58@gmail.com"
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
        "username": "julio.effertz",
        "primaryemail": "irvin.mante@yahoo.com",
        "useremails": [
            {
                "useremailid": 192,
                "useremail": "zesg59@gmail.com"
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
        "username": "dominque.witting",
        "primaryemail": "rene.cassin@hotmail.com",
        "useremails": [
            {
                "useremailid": 194,
                "useremail": "gioy45@gmail.com"
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
        "username": "daryl.rau",
        "primaryemail": "clotilde.feest@hotmail.com",
        "useremails": [
            {
                "useremailid": 196,
                "useremail": "peom18@gmail.com"
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
        "username": "edwina.ryan",
        "primaryemail": "nickolas.abshire@hotmail.com",
        "useremails": [
            {
                "useremailid": 198,
                "useremail": "ioma44@gmail.com"
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
        "username": "graham.connelly",
        "primaryemail": "jacquline.kassulke@yahoo.com",
        "useremails": [
            {
                "useremailid": 200,
                "useremail": "xmqi34@gmail.com"
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
        "username": "millard.stehr",
        "primaryemail": "booker.hickle@gmail.com",
        "useremails": [
            {
                "useremailid": 202,
                "useremail": "kqzy04@gmail.com"
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
        "username": "cordell.stark",
        "primaryemail": "rutha.lesch@yahoo.com",
        "useremails": [
            {
                "useremailid": 204,
                "useremail": "gxul40@gmail.com"
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
        "username": "diego.bradtke",
        "primaryemail": "aimee.windler@yahoo.com",
        "useremails": [
            {
                "useremailid": 206,
                "useremail": "ixxf48@gmail.com"
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
        "username": "johnathon.fritsch",
        "primaryemail": "thao.cassin@gmail.com",
        "useremails": [
            {
                "useremailid": 208,
                "useremail": "xjeb51@gmail.com"
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
        "username": "alfonzo.ondricka",
        "primaryemail": "illa.grady@gmail.com",
        "useremails": [
            {
                "useremailid": 210,
                "useremail": "opcw98@gmail.com"
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
        "username": "leslie.barrows",
        "primaryemail": "sang.deckow@gmail.com",
        "useremails": [
            {
                "useremailid": 212,
                "useremail": "wtwu00@gmail.com"
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
        "username": "jarred.hahn",
        "primaryemail": "jarrod.langosh@hotmail.com",
        "useremails": [
            {
                "useremailid": 214,
                "useremail": "kvjb04@gmail.com"
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
        "userid": 37,
        "username": "candida.harris",
        "primaryemail": "mendy.runolfsson@gmail.com",
        "useremails": [
            {
                "useremailid": 38,
                "useremail": "suuh50@gmail.com"
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
        "username": "jeromy.blanda",
        "primaryemail": "danyel.klein@gmail.com",
        "useremails": [
            {
                "useremailid": 66,
                "useremail": "ijic62@gmail.com"
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
        "username": "daryl.rau",
        "primaryemail": "clotilde.feest@hotmail.com",
        "useremails": [
            {
                "useremailid": 196,
                "useremail": "peom18@gmail.com"
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
No Body Data

Location Header: http://localhost:2019/users/user/217
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
        ]
}
```

OUTPUT

```TEXT
No Body Data

Status OK
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
No Body Data

Status OK
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/14</summary>

```TEXT
No Body Data

Status OK
```

</details>

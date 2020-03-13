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
                    "role": {
                        "roleid": 1,
                        "name": "ADMIN"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                },
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
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
                    "role": {
                        "roleid": 1,
                        "name": "ADMIN"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                },
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
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
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
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
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
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
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
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
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 16,
        "useremail": "ktvl47@gmail.com",
        "user": {
            "userid": 15,
            "username": "lissa.kozey",
            "primaryemail": "travis.paucek@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 18,
        "useremail": "yulx21@gmail.com",
        "user": {
            "userid": 17,
            "username": "steven.baumbach",
            "primaryemail": "krystle.runte@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 20,
        "useremail": "hiic80@gmail.com",
        "user": {
            "userid": 19,
            "username": "rodger.oberbrunner",
            "primaryemail": "rosio.auer@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 22,
        "useremail": "yqni30@gmail.com",
        "user": {
            "userid": 21,
            "username": "maud.franecki",
            "primaryemail": "laurence.kuhic@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 24,
        "useremail": "dfeu40@gmail.com",
        "user": {
            "userid": 23,
            "username": "kamala.gerlach",
            "primaryemail": "jude.ferry@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 26,
        "useremail": "lrlw81@gmail.com",
        "user": {
            "userid": 25,
            "username": "austin.hills",
            "primaryemail": "willard.zieme@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 28,
        "useremail": "dtbk30@gmail.com",
        "user": {
            "userid": 27,
            "username": "winford.schinner",
            "primaryemail": "emelia.okeefe@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 30,
        "useremail": "xckv22@gmail.com",
        "user": {
            "userid": 29,
            "username": "carmine.schinner",
            "primaryemail": "yu.lang@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 32,
        "useremail": "dciv80@gmail.com",
        "user": {
            "userid": 31,
            "username": "jeremy.zemlak",
            "primaryemail": "evelyne.towne@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 34,
        "useremail": "nidr33@gmail.com",
        "user": {
            "userid": 33,
            "username": "marilu.gleichner",
            "primaryemail": "wilson.buckridge@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 36,
        "useremail": "ozuy55@gmail.com",
        "user": {
            "userid": 35,
            "username": "cory.kiehn",
            "primaryemail": "cortez.gleason@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 38,
        "useremail": "mzmu47@gmail.com",
        "user": {
            "userid": 37,
            "username": "yasmine.cole",
            "primaryemail": "ronnie.hansen@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 40,
        "useremail": "nmqw03@gmail.com",
        "user": {
            "userid": 39,
            "username": "denice.adams",
            "primaryemail": "gaston.hills@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 42,
        "useremail": "mlsp88@gmail.com",
        "user": {
            "userid": 41,
            "username": "bruno.ullrich",
            "primaryemail": "bob.donnelly@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 44,
        "useremail": "xzhc08@gmail.com",
        "user": {
            "userid": 43,
            "username": "charlena.wisoky",
            "primaryemail": "kent.gaylord@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 46,
        "useremail": "dgwn83@gmail.com",
        "user": {
            "userid": 45,
            "username": "beatris.becker",
            "primaryemail": "david.pagac@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 48,
        "useremail": "hfga42@gmail.com",
        "user": {
            "userid": 47,
            "username": "nicholas.auer",
            "primaryemail": "annette.mosciski@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 50,
        "useremail": "uavp26@gmail.com",
        "user": {
            "userid": 49,
            "username": "toney.zulauf",
            "primaryemail": "bennie.hickle@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 52,
        "useremail": "qwli22@gmail.com",
        "user": {
            "userid": 51,
            "username": "josef.ohara",
            "primaryemail": "cornelia.bergnaum@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 54,
        "useremail": "fwxr36@gmail.com",
        "user": {
            "userid": 53,
            "username": "reinaldo.jacobson",
            "primaryemail": "jetta.stoltenberg@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 56,
        "useremail": "fblp91@gmail.com",
        "user": {
            "userid": 55,
            "username": "jamel.reilly",
            "primaryemail": "guy.cummerata@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 58,
        "useremail": "quoo54@gmail.com",
        "user": {
            "userid": 57,
            "username": "laveta.pfeffer",
            "primaryemail": "michel.medhurst@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 60,
        "useremail": "pssx77@gmail.com",
        "user": {
            "userid": 59,
            "username": "otto.kub",
            "primaryemail": "pennie.hodkiewicz@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 62,
        "useremail": "whst58@gmail.com",
        "user": {
            "userid": 61,
            "username": "latrice.goldner",
            "primaryemail": "dustin.maggio@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 64,
        "useremail": "nmjt08@gmail.com",
        "user": {
            "userid": 63,
            "username": "scot.ratke",
            "primaryemail": "christoper.effertz@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 66,
        "useremail": "hifw12@gmail.com",
        "user": {
            "userid": 65,
            "username": "eduardo.von",
            "primaryemail": "yuonne.mayert@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 68,
        "useremail": "ydqc71@gmail.com",
        "user": {
            "userid": 67,
            "username": "ammie.nader",
            "primaryemail": "amado.kiehn@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 70,
        "useremail": "apcj76@gmail.com",
        "user": {
            "userid": 69,
            "username": "luther.bednar",
            "primaryemail": "lamont.botsford@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 72,
        "useremail": "haun91@gmail.com",
        "user": {
            "userid": 71,
            "username": "alfred.crona",
            "primaryemail": "fanny.emmerich@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 74,
        "useremail": "pure59@gmail.com",
        "user": {
            "userid": 73,
            "username": "demetra.hegmann",
            "primaryemail": "terrell.bogisich@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 76,
        "useremail": "lkyt74@gmail.com",
        "user": {
            "userid": 75,
            "username": "jarrett.howell",
            "primaryemail": "antony.bashirian@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 78,
        "useremail": "hjux42@gmail.com",
        "user": {
            "userid": 77,
            "username": "rowena.upton",
            "primaryemail": "adelaida.lowe@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 80,
        "useremail": "pjju04@gmail.com",
        "user": {
            "userid": 79,
            "username": "oren.feeney",
            "primaryemail": "dottie.walter@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 82,
        "useremail": "qizo16@gmail.com",
        "user": {
            "userid": 81,
            "username": "ricardo.macejkovic",
            "primaryemail": "keira.casper@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 84,
        "useremail": "vdvo15@gmail.com",
        "user": {
            "userid": 83,
            "username": "devona.trantow",
            "primaryemail": "regenia.dietrich@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 86,
        "useremail": "soke85@gmail.com",
        "user": {
            "userid": 85,
            "username": "chelsie.pollich",
            "primaryemail": "rachael.haag@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 88,
        "useremail": "psae56@gmail.com",
        "user": {
            "userid": 87,
            "username": "kacey.dicki",
            "primaryemail": "lyman.schinner@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 90,
        "useremail": "mnze51@gmail.com",
        "user": {
            "userid": 89,
            "username": "simonne.schumm",
            "primaryemail": "beryl.harris@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 92,
        "useremail": "aavi78@gmail.com",
        "user": {
            "userid": 91,
            "username": "cesar.miller",
            "primaryemail": "rolf.tromp@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 94,
        "useremail": "rxzp70@gmail.com",
        "user": {
            "userid": 93,
            "username": "salvador.hamill",
            "primaryemail": "shane.kautzer@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 96,
        "useremail": "hxij12@gmail.com",
        "user": {
            "userid": 95,
            "username": "beula.nienow",
            "primaryemail": "clayton.kemmer@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 98,
        "useremail": "ijxu00@gmail.com",
        "user": {
            "userid": 97,
            "username": "shera.moen",
            "primaryemail": "levi.smitham@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 100,
        "useremail": "bszy85@gmail.com",
        "user": {
            "userid": 99,
            "username": "lamar.glover",
            "primaryemail": "otha.lemke@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 102,
        "useremail": "chdt33@gmail.com",
        "user": {
            "userid": 101,
            "username": "lyman.medhurst",
            "primaryemail": "maryln.larkin@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 104,
        "useremail": "tfge95@gmail.com",
        "user": {
            "userid": 103,
            "username": "shaina.sporer",
            "primaryemail": "raleigh.kris@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 106,
        "useremail": "oxnz87@gmail.com",
        "user": {
            "userid": 105,
            "username": "petronila.kulas",
            "primaryemail": "kathline.hilpert@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 108,
        "useremail": "pcnt06@gmail.com",
        "user": {
            "userid": 107,
            "username": "burl.towne",
            "primaryemail": "krishna.pouros@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 110,
        "useremail": "dhpn57@gmail.com",
        "user": {
            "userid": 109,
            "username": "rick.kovacek",
            "primaryemail": "hallie.bogisich@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 112,
        "useremail": "qewp88@gmail.com",
        "user": {
            "userid": 111,
            "username": "jacalyn.greenholt",
            "primaryemail": "celesta.pollich@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 114,
        "useremail": "xhag33@gmail.com",
        "user": {
            "userid": 113,
            "username": "garry.mccullough",
            "primaryemail": "mirta.beer@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 116,
        "useremail": "glua70@gmail.com",
        "user": {
            "userid": 115,
            "username": "lore.block",
            "primaryemail": "maryrose.gleichner@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 118,
        "useremail": "awab69@gmail.com",
        "user": {
            "userid": 117,
            "username": "hyman.bartoletti",
            "primaryemail": "mauro.kohler@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 120,
        "useremail": "znui92@gmail.com",
        "user": {
            "userid": 119,
            "username": "bennie.waters",
            "primaryemail": "patria.bergnaum@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 122,
        "useremail": "htfz95@gmail.com",
        "user": {
            "userid": 121,
            "username": "ana.casper",
            "primaryemail": "malika.reynolds@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 124,
        "useremail": "bpym81@gmail.com",
        "user": {
            "userid": 123,
            "username": "phung.jacobson",
            "primaryemail": "wenona.nicolas@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 126,
        "useremail": "vipr18@gmail.com",
        "user": {
            "userid": 125,
            "username": "ping.koelpin",
            "primaryemail": "karoline.mayer@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 128,
        "useremail": "kego24@gmail.com",
        "user": {
            "userid": 127,
            "username": "royce.hansen",
            "primaryemail": "tasia.daugherty@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 130,
        "useremail": "koba70@gmail.com",
        "user": {
            "userid": 129,
            "username": "loura.reichel",
            "primaryemail": "zane.prosacco@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 132,
        "useremail": "plnp53@gmail.com",
        "user": {
            "userid": 131,
            "username": "tom.turner",
            "primaryemail": "porsche.nolan@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 134,
        "useremail": "odbe01@gmail.com",
        "user": {
            "userid": 133,
            "username": "tillie.rohan",
            "primaryemail": "arthur.kulas@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 136,
        "useremail": "xabn70@gmail.com",
        "user": {
            "userid": 135,
            "username": "zachariah.okeefe",
            "primaryemail": "cornell.kreiger@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 138,
        "useremail": "tmpb40@gmail.com",
        "user": {
            "userid": 137,
            "username": "jeanene.williamson",
            "primaryemail": "mitch.dickens@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 140,
        "useremail": "msmt18@gmail.com",
        "user": {
            "userid": 139,
            "username": "danial.donnelly",
            "primaryemail": "grant.lemke@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 142,
        "useremail": "acsa19@gmail.com",
        "user": {
            "userid": 141,
            "username": "jared.mitchell",
            "primaryemail": "will.windler@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 144,
        "useremail": "husp88@gmail.com",
        "user": {
            "userid": 143,
            "username": "martin.tromp",
            "primaryemail": "justin.parisian@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 146,
        "useremail": "igpk35@gmail.com",
        "user": {
            "userid": 145,
            "username": "young.okuneva",
            "primaryemail": "nancee.dibbert@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 148,
        "useremail": "jris05@gmail.com",
        "user": {
            "userid": 147,
            "username": "theron.kulas",
            "primaryemail": "kendrick.hermann@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 150,
        "useremail": "snmi25@gmail.com",
        "user": {
            "userid": 149,
            "username": "pauline.doyle",
            "primaryemail": "reyna.west@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 152,
        "useremail": "swwv26@gmail.com",
        "user": {
            "userid": 151,
            "username": "chung.cummings",
            "primaryemail": "gita.schaden@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 154,
        "useremail": "mani92@gmail.com",
        "user": {
            "userid": 153,
            "username": "chad.davis",
            "primaryemail": "emmett.wyman@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 156,
        "useremail": "xbjv23@gmail.com",
        "user": {
            "userid": 155,
            "username": "melony.mcdermott",
            "primaryemail": "deandre.yundt@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 158,
        "useremail": "srxc46@gmail.com",
        "user": {
            "userid": 157,
            "username": "trevor.cruickshank",
            "primaryemail": "melia.lakin@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 160,
        "useremail": "vasm73@gmail.com",
        "user": {
            "userid": 159,
            "username": "louis.harris",
            "primaryemail": "lyndsey.medhurst@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 162,
        "useremail": "hmvz98@gmail.com",
        "user": {
            "userid": 161,
            "username": "robin.muller",
            "primaryemail": "grayce.waters@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 164,
        "useremail": "iqjc59@gmail.com",
        "user": {
            "userid": 163,
            "username": "delcie.haley",
            "primaryemail": "connie.fay@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 166,
        "useremail": "vizb39@gmail.com",
        "user": {
            "userid": 165,
            "username": "rolf.stamm",
            "primaryemail": "valorie.gottlieb@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 168,
        "useremail": "ucqu57@gmail.com",
        "user": {
            "userid": 167,
            "username": "carol.zemlak",
            "primaryemail": "darryl.schneider@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 170,
        "useremail": "dbxb99@gmail.com",
        "user": {
            "userid": 169,
            "username": "matthew.larson",
            "primaryemail": "megan.ryan@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 172,
        "useremail": "gkkd51@gmail.com",
        "user": {
            "userid": 171,
            "username": "elliott.ziemann",
            "primaryemail": "sharee.spencer@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 174,
        "useremail": "msid12@gmail.com",
        "user": {
            "userid": 173,
            "username": "mercedes.brown",
            "primaryemail": "chere.torp@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 176,
        "useremail": "fxpv21@gmail.com",
        "user": {
            "userid": 175,
            "username": "alysha.douglas",
            "primaryemail": "bradford.dietrich@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 178,
        "useremail": "eqhu66@gmail.com",
        "user": {
            "userid": 177,
            "username": "mirian.fahey",
            "primaryemail": "jules.conroy@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 180,
        "useremail": "pkxp63@gmail.com",
        "user": {
            "userid": 179,
            "username": "thomasina.cassin",
            "primaryemail": "alfredo.stoltenberg@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 182,
        "useremail": "nkkv66@gmail.com",
        "user": {
            "userid": 181,
            "username": "tereasa.rohan",
            "primaryemail": "eda.collier@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 184,
        "useremail": "ahem48@gmail.com",
        "user": {
            "userid": 183,
            "username": "valentine.bergstrom",
            "primaryemail": "patricia.lueilwitz@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 186,
        "useremail": "arcr87@gmail.com",
        "user": {
            "userid": 185,
            "username": "lesia.murphy",
            "primaryemail": "cristobal.stoltenberg@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 188,
        "useremail": "bmaj64@gmail.com",
        "user": {
            "userid": 187,
            "username": "hollis.gorczany",
            "primaryemail": "leia.hilll@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 190,
        "useremail": "koan11@gmail.com",
        "user": {
            "userid": 189,
            "username": "phil.swift",
            "primaryemail": "julius.goodwin@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 192,
        "useremail": "uiso01@gmail.com",
        "user": {
            "userid": 191,
            "username": "rosendo.mohr",
            "primaryemail": "chloe.larkin@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 194,
        "useremail": "ccxn20@gmail.com",
        "user": {
            "userid": 193,
            "username": "denny.gusikowski",
            "primaryemail": "emanuel.spinka@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 196,
        "useremail": "ylhl70@gmail.com",
        "user": {
            "userid": 195,
            "username": "johnathon.littel",
            "primaryemail": "fabian.kovacek@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 198,
        "useremail": "tgjq90@gmail.com",
        "user": {
            "userid": 197,
            "username": "pinkie.ferry",
            "primaryemail": "harriette.hahn@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 200,
        "useremail": "jicv63@gmail.com",
        "user": {
            "userid": 199,
            "username": "nicki.jast",
            "primaryemail": "stewart.nicolas@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 202,
        "useremail": "pgtd99@gmail.com",
        "user": {
            "userid": 201,
            "username": "diamond.gutmann",
            "primaryemail": "john.doyle@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 204,
        "useremail": "wcmc06@gmail.com",
        "user": {
            "userid": 203,
            "username": "peter.rice",
            "primaryemail": "suzette.oconner@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 206,
        "useremail": "kupa35@gmail.com",
        "user": {
            "userid": 205,
            "username": "efren.gerlach",
            "primaryemail": "jonas.schroeder@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 208,
        "useremail": "dusz62@gmail.com",
        "user": {
            "userid": 207,
            "username": "craig.volkman",
            "primaryemail": "bill.hane@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 210,
        "useremail": "hllv24@gmail.com",
        "user": {
            "userid": 209,
            "username": "kera.mills",
            "primaryemail": "patrick.spinka@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 212,
        "useremail": "vgiu66@gmail.com",
        "user": {
            "userid": 211,
            "username": "melvin.funk",
            "primaryemail": "trinity.crooks@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 214,
        "useremail": "xebt86@gmail.com",
        "user": {
            "userid": 213,
            "username": "cristy.kilback",
            "primaryemail": "napoleon.skiles@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
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
                "role": {
                    "roleid": 3,
                    "name": "DATA"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
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
    "timestamp": "2020-03-12T22:37:55.484+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "Useremail with id 8888 Not Found!",
    "trace": "javax.persistence.EntityNotFoundException: Useremail with id 8888 Not Found!\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.lambda$findUseremailById$0(UseremailServiceImpl.java:48)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:408)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.findUseremailById(UseremailServiceImpl.java:48)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$FastClassBySpringCGLIB$$f1b1885e.invoke(<generated>)\n\tat org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:769)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:366)\n\tat org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:99)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:689)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$EnhancerBySpringCGLIB$$64bacf2a.findUseremailById(<generated>)\n\tat com.lambdaschool.usermodel.controllers.UseremailController.getUserEmailById(UseremailController.java:61)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:879)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:634)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:541)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:367)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1639)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:834)\n",
    "path": "/useremails/useremail/8888"
}
```

</details>

<details>
<summary>DELETE http://localhost:2019/useremails/useremail/8</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>PUT http://localhost:2019/useremails/useremail/9/email/favbun@hops.local</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>POST http://localhost:2019/useremails/user/15/email/favbun@hops.local</summary>

```TEXT
No Body Data

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
                "user": {
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
            }
        ]
    },
    {
        "roleid": 2,
        "name": "USER",
        "users": [
            {
                "user": {
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
            },
            {
                "user": {
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
            },
            {
                "user": {
                    "userid": 11,
                    "username": "barnbarn",
                    "primaryemail": "barnbarn@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 12,
                            "useremail": "barnbarn@email.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 13,
                    "username": "puttat",
                    "primaryemail": "puttat@school.lambda",
                    "useremails": []
                }
            },
            {
                "user": {
                    "userid": 14,
                    "username": "misskitty",
                    "primaryemail": "misskitty@school.lambda",
                    "useremails": []
                }
            },
            {
                "user": {
                    "userid": 15,
                    "username": "lissa.kozey",
                    "primaryemail": "travis.paucek@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 16,
                            "useremail": "ktvl47@gmail.com"
                        },
                        {
                            "useremailid": 215,
                            "useremail": "favbun@hops.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 17,
                    "username": "steven.baumbach",
                    "primaryemail": "krystle.runte@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 18,
                            "useremail": "yulx21@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 19,
                    "username": "rodger.oberbrunner",
                    "primaryemail": "rosio.auer@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 20,
                            "useremail": "hiic80@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 21,
                    "username": "maud.franecki",
                    "primaryemail": "laurence.kuhic@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 22,
                            "useremail": "yqni30@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 23,
                    "username": "kamala.gerlach",
                    "primaryemail": "jude.ferry@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 24,
                            "useremail": "dfeu40@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 25,
                    "username": "austin.hills",
                    "primaryemail": "willard.zieme@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 26,
                            "useremail": "lrlw81@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 27,
                    "username": "winford.schinner",
                    "primaryemail": "emelia.okeefe@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 28,
                            "useremail": "dtbk30@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 29,
                    "username": "carmine.schinner",
                    "primaryemail": "yu.lang@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 30,
                            "useremail": "xckv22@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 31,
                    "username": "jeremy.zemlak",
                    "primaryemail": "evelyne.towne@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 32,
                            "useremail": "dciv80@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 33,
                    "username": "marilu.gleichner",
                    "primaryemail": "wilson.buckridge@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 34,
                            "useremail": "nidr33@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 35,
                    "username": "cory.kiehn",
                    "primaryemail": "cortez.gleason@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 36,
                            "useremail": "ozuy55@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 37,
                    "username": "yasmine.cole",
                    "primaryemail": "ronnie.hansen@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 38,
                            "useremail": "mzmu47@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 39,
                    "username": "denice.adams",
                    "primaryemail": "gaston.hills@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 40,
                            "useremail": "nmqw03@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 41,
                    "username": "bruno.ullrich",
                    "primaryemail": "bob.donnelly@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 42,
                            "useremail": "mlsp88@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 43,
                    "username": "charlena.wisoky",
                    "primaryemail": "kent.gaylord@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 44,
                            "useremail": "xzhc08@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 45,
                    "username": "beatris.becker",
                    "primaryemail": "david.pagac@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 46,
                            "useremail": "dgwn83@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 47,
                    "username": "nicholas.auer",
                    "primaryemail": "annette.mosciski@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 48,
                            "useremail": "hfga42@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 49,
                    "username": "toney.zulauf",
                    "primaryemail": "bennie.hickle@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 50,
                            "useremail": "uavp26@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 51,
                    "username": "josef.ohara",
                    "primaryemail": "cornelia.bergnaum@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 52,
                            "useremail": "qwli22@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 53,
                    "username": "reinaldo.jacobson",
                    "primaryemail": "jetta.stoltenberg@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 54,
                            "useremail": "fwxr36@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 55,
                    "username": "jamel.reilly",
                    "primaryemail": "guy.cummerata@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 56,
                            "useremail": "fblp91@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 57,
                    "username": "laveta.pfeffer",
                    "primaryemail": "michel.medhurst@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 58,
                            "useremail": "quoo54@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 59,
                    "username": "otto.kub",
                    "primaryemail": "pennie.hodkiewicz@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 60,
                            "useremail": "pssx77@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 61,
                    "username": "latrice.goldner",
                    "primaryemail": "dustin.maggio@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 62,
                            "useremail": "whst58@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 63,
                    "username": "scot.ratke",
                    "primaryemail": "christoper.effertz@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 64,
                            "useremail": "nmjt08@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 65,
                    "username": "eduardo.von",
                    "primaryemail": "yuonne.mayert@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 66,
                            "useremail": "hifw12@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 67,
                    "username": "ammie.nader",
                    "primaryemail": "amado.kiehn@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 68,
                            "useremail": "ydqc71@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 69,
                    "username": "luther.bednar",
                    "primaryemail": "lamont.botsford@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 70,
                            "useremail": "apcj76@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 71,
                    "username": "alfred.crona",
                    "primaryemail": "fanny.emmerich@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 72,
                            "useremail": "haun91@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 73,
                    "username": "demetra.hegmann",
                    "primaryemail": "terrell.bogisich@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 74,
                            "useremail": "pure59@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 75,
                    "username": "jarrett.howell",
                    "primaryemail": "antony.bashirian@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 76,
                            "useremail": "lkyt74@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 77,
                    "username": "rowena.upton",
                    "primaryemail": "adelaida.lowe@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 78,
                            "useremail": "hjux42@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 79,
                    "username": "oren.feeney",
                    "primaryemail": "dottie.walter@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 80,
                            "useremail": "pjju04@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 81,
                    "username": "ricardo.macejkovic",
                    "primaryemail": "keira.casper@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 82,
                            "useremail": "qizo16@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 83,
                    "username": "devona.trantow",
                    "primaryemail": "regenia.dietrich@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 84,
                            "useremail": "vdvo15@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 85,
                    "username": "chelsie.pollich",
                    "primaryemail": "rachael.haag@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 86,
                            "useremail": "soke85@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 87,
                    "username": "kacey.dicki",
                    "primaryemail": "lyman.schinner@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 88,
                            "useremail": "psae56@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 89,
                    "username": "simonne.schumm",
                    "primaryemail": "beryl.harris@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 90,
                            "useremail": "mnze51@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 91,
                    "username": "cesar.miller",
                    "primaryemail": "rolf.tromp@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 92,
                            "useremail": "aavi78@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 93,
                    "username": "salvador.hamill",
                    "primaryemail": "shane.kautzer@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 94,
                            "useremail": "rxzp70@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 95,
                    "username": "beula.nienow",
                    "primaryemail": "clayton.kemmer@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 96,
                            "useremail": "hxij12@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 97,
                    "username": "shera.moen",
                    "primaryemail": "levi.smitham@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 98,
                            "useremail": "ijxu00@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 99,
                    "username": "lamar.glover",
                    "primaryemail": "otha.lemke@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 100,
                            "useremail": "bszy85@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 101,
                    "username": "lyman.medhurst",
                    "primaryemail": "maryln.larkin@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 102,
                            "useremail": "chdt33@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 103,
                    "username": "shaina.sporer",
                    "primaryemail": "raleigh.kris@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 104,
                            "useremail": "tfge95@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 105,
                    "username": "petronila.kulas",
                    "primaryemail": "kathline.hilpert@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 106,
                            "useremail": "oxnz87@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 107,
                    "username": "burl.towne",
                    "primaryemail": "krishna.pouros@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 108,
                            "useremail": "pcnt06@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 109,
                    "username": "rick.kovacek",
                    "primaryemail": "hallie.bogisich@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 110,
                            "useremail": "dhpn57@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 111,
                    "username": "jacalyn.greenholt",
                    "primaryemail": "celesta.pollich@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 112,
                            "useremail": "qewp88@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 113,
                    "username": "garry.mccullough",
                    "primaryemail": "mirta.beer@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 114,
                            "useremail": "xhag33@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 115,
                    "username": "lore.block",
                    "primaryemail": "maryrose.gleichner@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 116,
                            "useremail": "glua70@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 117,
                    "username": "hyman.bartoletti",
                    "primaryemail": "mauro.kohler@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 118,
                            "useremail": "awab69@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 119,
                    "username": "bennie.waters",
                    "primaryemail": "patria.bergnaum@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 120,
                            "useremail": "znui92@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 121,
                    "username": "ana.casper",
                    "primaryemail": "malika.reynolds@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 122,
                            "useremail": "htfz95@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 123,
                    "username": "phung.jacobson",
                    "primaryemail": "wenona.nicolas@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 124,
                            "useremail": "bpym81@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 125,
                    "username": "ping.koelpin",
                    "primaryemail": "karoline.mayer@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 126,
                            "useremail": "vipr18@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 127,
                    "username": "royce.hansen",
                    "primaryemail": "tasia.daugherty@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 128,
                            "useremail": "kego24@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 129,
                    "username": "loura.reichel",
                    "primaryemail": "zane.prosacco@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 130,
                            "useremail": "koba70@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 131,
                    "username": "tom.turner",
                    "primaryemail": "porsche.nolan@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 132,
                            "useremail": "plnp53@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 133,
                    "username": "tillie.rohan",
                    "primaryemail": "arthur.kulas@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 134,
                            "useremail": "odbe01@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 135,
                    "username": "zachariah.okeefe",
                    "primaryemail": "cornell.kreiger@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 136,
                            "useremail": "xabn70@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 137,
                    "username": "jeanene.williamson",
                    "primaryemail": "mitch.dickens@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 138,
                            "useremail": "tmpb40@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 139,
                    "username": "danial.donnelly",
                    "primaryemail": "grant.lemke@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 140,
                            "useremail": "msmt18@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 141,
                    "username": "jared.mitchell",
                    "primaryemail": "will.windler@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 142,
                            "useremail": "acsa19@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 143,
                    "username": "martin.tromp",
                    "primaryemail": "justin.parisian@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 144,
                            "useremail": "husp88@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 145,
                    "username": "young.okuneva",
                    "primaryemail": "nancee.dibbert@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 146,
                            "useremail": "igpk35@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 147,
                    "username": "theron.kulas",
                    "primaryemail": "kendrick.hermann@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 148,
                            "useremail": "jris05@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 149,
                    "username": "pauline.doyle",
                    "primaryemail": "reyna.west@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 150,
                            "useremail": "snmi25@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 151,
                    "username": "chung.cummings",
                    "primaryemail": "gita.schaden@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 152,
                            "useremail": "swwv26@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 153,
                    "username": "chad.davis",
                    "primaryemail": "emmett.wyman@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 154,
                            "useremail": "mani92@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 155,
                    "username": "melony.mcdermott",
                    "primaryemail": "deandre.yundt@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 156,
                            "useremail": "xbjv23@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 157,
                    "username": "trevor.cruickshank",
                    "primaryemail": "melia.lakin@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 158,
                            "useremail": "srxc46@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 159,
                    "username": "louis.harris",
                    "primaryemail": "lyndsey.medhurst@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 160,
                            "useremail": "vasm73@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 161,
                    "username": "robin.muller",
                    "primaryemail": "grayce.waters@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 162,
                            "useremail": "hmvz98@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 163,
                    "username": "delcie.haley",
                    "primaryemail": "connie.fay@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 164,
                            "useremail": "iqjc59@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 165,
                    "username": "rolf.stamm",
                    "primaryemail": "valorie.gottlieb@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 166,
                            "useremail": "vizb39@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 167,
                    "username": "carol.zemlak",
                    "primaryemail": "darryl.schneider@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 168,
                            "useremail": "ucqu57@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 169,
                    "username": "matthew.larson",
                    "primaryemail": "megan.ryan@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 170,
                            "useremail": "dbxb99@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 171,
                    "username": "elliott.ziemann",
                    "primaryemail": "sharee.spencer@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 172,
                            "useremail": "gkkd51@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 173,
                    "username": "mercedes.brown",
                    "primaryemail": "chere.torp@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 174,
                            "useremail": "msid12@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 175,
                    "username": "alysha.douglas",
                    "primaryemail": "bradford.dietrich@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 176,
                            "useremail": "fxpv21@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 177,
                    "username": "mirian.fahey",
                    "primaryemail": "jules.conroy@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 178,
                            "useremail": "eqhu66@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 179,
                    "username": "thomasina.cassin",
                    "primaryemail": "alfredo.stoltenberg@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 180,
                            "useremail": "pkxp63@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 181,
                    "username": "tereasa.rohan",
                    "primaryemail": "eda.collier@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 182,
                            "useremail": "nkkv66@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 183,
                    "username": "valentine.bergstrom",
                    "primaryemail": "patricia.lueilwitz@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 184,
                            "useremail": "ahem48@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 185,
                    "username": "lesia.murphy",
                    "primaryemail": "cristobal.stoltenberg@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 186,
                            "useremail": "arcr87@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 187,
                    "username": "hollis.gorczany",
                    "primaryemail": "leia.hilll@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 188,
                            "useremail": "bmaj64@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 189,
                    "username": "phil.swift",
                    "primaryemail": "julius.goodwin@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 190,
                            "useremail": "koan11@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 191,
                    "username": "rosendo.mohr",
                    "primaryemail": "chloe.larkin@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 192,
                            "useremail": "uiso01@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 193,
                    "username": "denny.gusikowski",
                    "primaryemail": "emanuel.spinka@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 194,
                            "useremail": "ccxn20@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 195,
                    "username": "johnathon.littel",
                    "primaryemail": "fabian.kovacek@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 196,
                            "useremail": "ylhl70@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 197,
                    "username": "pinkie.ferry",
                    "primaryemail": "harriette.hahn@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 198,
                            "useremail": "tgjq90@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 199,
                    "username": "nicki.jast",
                    "primaryemail": "stewart.nicolas@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 200,
                            "useremail": "jicv63@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 201,
                    "username": "diamond.gutmann",
                    "primaryemail": "john.doyle@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 202,
                            "useremail": "pgtd99@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 203,
                    "username": "peter.rice",
                    "primaryemail": "suzette.oconner@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 204,
                            "useremail": "wcmc06@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 205,
                    "username": "efren.gerlach",
                    "primaryemail": "jonas.schroeder@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 206,
                            "useremail": "kupa35@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 207,
                    "username": "craig.volkman",
                    "primaryemail": "bill.hane@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 208,
                            "useremail": "dusz62@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 209,
                    "username": "kera.mills",
                    "primaryemail": "patrick.spinka@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 210,
                            "useremail": "hllv24@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 211,
                    "username": "melvin.funk",
                    "primaryemail": "trinity.crooks@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 212,
                            "useremail": "vgiu66@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 213,
                    "username": "cristy.kilback",
                    "primaryemail": "napoleon.skiles@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 214,
                            "useremail": "xebt86@gmail.com"
                        }
                    ]
                }
            }
        ]
    },
    {
        "roleid": 3,
        "name": "DATA",
        "users": [
            {
                "user": {
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
            },
            {
                "user": {
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
            "user": {
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
        },
        {
            "user": {
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
            "user": {
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
        },
        {
            "user": {
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
No Body Data

Location Header: http://localhost:2019/roles/role/216
Status 201 Created
```

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
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
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
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
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
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
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
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
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
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 15,
        "username": "lissa.kozey",
        "primaryemail": "travis.paucek@gmail.com",
        "useremails": [
            {
                "useremailid": 16,
                "useremail": "ktvl47@gmail.com"
            },
            {
                "useremailid": 215,
                "useremail": "favbun@hops.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 17,
        "username": "steven.baumbach",
        "primaryemail": "krystle.runte@hotmail.com",
        "useremails": [
            {
                "useremailid": 18,
                "useremail": "yulx21@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 19,
        "username": "rodger.oberbrunner",
        "primaryemail": "rosio.auer@hotmail.com",
        "useremails": [
            {
                "useremailid": 20,
                "useremail": "hiic80@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 21,
        "username": "maud.franecki",
        "primaryemail": "laurence.kuhic@gmail.com",
        "useremails": [
            {
                "useremailid": 22,
                "useremail": "yqni30@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 23,
        "username": "kamala.gerlach",
        "primaryemail": "jude.ferry@gmail.com",
        "useremails": [
            {
                "useremailid": 24,
                "useremail": "dfeu40@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 25,
        "username": "austin.hills",
        "primaryemail": "willard.zieme@gmail.com",
        "useremails": [
            {
                "useremailid": 26,
                "useremail": "lrlw81@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 27,
        "username": "winford.schinner",
        "primaryemail": "emelia.okeefe@hotmail.com",
        "useremails": [
            {
                "useremailid": 28,
                "useremail": "dtbk30@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 29,
        "username": "carmine.schinner",
        "primaryemail": "yu.lang@gmail.com",
        "useremails": [
            {
                "useremailid": 30,
                "useremail": "xckv22@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 31,
        "username": "jeremy.zemlak",
        "primaryemail": "evelyne.towne@gmail.com",
        "useremails": [
            {
                "useremailid": 32,
                "useremail": "dciv80@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 33,
        "username": "marilu.gleichner",
        "primaryemail": "wilson.buckridge@yahoo.com",
        "useremails": [
            {
                "useremailid": 34,
                "useremail": "nidr33@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 35,
        "username": "cory.kiehn",
        "primaryemail": "cortez.gleason@yahoo.com",
        "useremails": [
            {
                "useremailid": 36,
                "useremail": "ozuy55@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 37,
        "username": "yasmine.cole",
        "primaryemail": "ronnie.hansen@hotmail.com",
        "useremails": [
            {
                "useremailid": 38,
                "useremail": "mzmu47@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 39,
        "username": "denice.adams",
        "primaryemail": "gaston.hills@hotmail.com",
        "useremails": [
            {
                "useremailid": 40,
                "useremail": "nmqw03@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 41,
        "username": "bruno.ullrich",
        "primaryemail": "bob.donnelly@gmail.com",
        "useremails": [
            {
                "useremailid": 42,
                "useremail": "mlsp88@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 43,
        "username": "charlena.wisoky",
        "primaryemail": "kent.gaylord@yahoo.com",
        "useremails": [
            {
                "useremailid": 44,
                "useremail": "xzhc08@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 45,
        "username": "beatris.becker",
        "primaryemail": "david.pagac@yahoo.com",
        "useremails": [
            {
                "useremailid": 46,
                "useremail": "dgwn83@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 47,
        "username": "nicholas.auer",
        "primaryemail": "annette.mosciski@yahoo.com",
        "useremails": [
            {
                "useremailid": 48,
                "useremail": "hfga42@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 49,
        "username": "toney.zulauf",
        "primaryemail": "bennie.hickle@hotmail.com",
        "useremails": [
            {
                "useremailid": 50,
                "useremail": "uavp26@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 51,
        "username": "josef.ohara",
        "primaryemail": "cornelia.bergnaum@hotmail.com",
        "useremails": [
            {
                "useremailid": 52,
                "useremail": "qwli22@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 53,
        "username": "reinaldo.jacobson",
        "primaryemail": "jetta.stoltenberg@hotmail.com",
        "useremails": [
            {
                "useremailid": 54,
                "useremail": "fwxr36@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 55,
        "username": "jamel.reilly",
        "primaryemail": "guy.cummerata@gmail.com",
        "useremails": [
            {
                "useremailid": 56,
                "useremail": "fblp91@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 57,
        "username": "laveta.pfeffer",
        "primaryemail": "michel.medhurst@hotmail.com",
        "useremails": [
            {
                "useremailid": 58,
                "useremail": "quoo54@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 59,
        "username": "otto.kub",
        "primaryemail": "pennie.hodkiewicz@hotmail.com",
        "useremails": [
            {
                "useremailid": 60,
                "useremail": "pssx77@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 61,
        "username": "latrice.goldner",
        "primaryemail": "dustin.maggio@yahoo.com",
        "useremails": [
            {
                "useremailid": 62,
                "useremail": "whst58@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 63,
        "username": "scot.ratke",
        "primaryemail": "christoper.effertz@gmail.com",
        "useremails": [
            {
                "useremailid": 64,
                "useremail": "nmjt08@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 65,
        "username": "eduardo.von",
        "primaryemail": "yuonne.mayert@gmail.com",
        "useremails": [
            {
                "useremailid": 66,
                "useremail": "hifw12@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 67,
        "username": "ammie.nader",
        "primaryemail": "amado.kiehn@gmail.com",
        "useremails": [
            {
                "useremailid": 68,
                "useremail": "ydqc71@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 69,
        "username": "luther.bednar",
        "primaryemail": "lamont.botsford@yahoo.com",
        "useremails": [
            {
                "useremailid": 70,
                "useremail": "apcj76@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 71,
        "username": "alfred.crona",
        "primaryemail": "fanny.emmerich@hotmail.com",
        "useremails": [
            {
                "useremailid": 72,
                "useremail": "haun91@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 73,
        "username": "demetra.hegmann",
        "primaryemail": "terrell.bogisich@gmail.com",
        "useremails": [
            {
                "useremailid": 74,
                "useremail": "pure59@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 75,
        "username": "jarrett.howell",
        "primaryemail": "antony.bashirian@gmail.com",
        "useremails": [
            {
                "useremailid": 76,
                "useremail": "lkyt74@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 77,
        "username": "rowena.upton",
        "primaryemail": "adelaida.lowe@hotmail.com",
        "useremails": [
            {
                "useremailid": 78,
                "useremail": "hjux42@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 79,
        "username": "oren.feeney",
        "primaryemail": "dottie.walter@yahoo.com",
        "useremails": [
            {
                "useremailid": 80,
                "useremail": "pjju04@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 81,
        "username": "ricardo.macejkovic",
        "primaryemail": "keira.casper@yahoo.com",
        "useremails": [
            {
                "useremailid": 82,
                "useremail": "qizo16@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 83,
        "username": "devona.trantow",
        "primaryemail": "regenia.dietrich@yahoo.com",
        "useremails": [
            {
                "useremailid": 84,
                "useremail": "vdvo15@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 85,
        "username": "chelsie.pollich",
        "primaryemail": "rachael.haag@yahoo.com",
        "useremails": [
            {
                "useremailid": 86,
                "useremail": "soke85@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 87,
        "username": "kacey.dicki",
        "primaryemail": "lyman.schinner@gmail.com",
        "useremails": [
            {
                "useremailid": 88,
                "useremail": "psae56@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 89,
        "username": "simonne.schumm",
        "primaryemail": "beryl.harris@yahoo.com",
        "useremails": [
            {
                "useremailid": 90,
                "useremail": "mnze51@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 91,
        "username": "cesar.miller",
        "primaryemail": "rolf.tromp@hotmail.com",
        "useremails": [
            {
                "useremailid": 92,
                "useremail": "aavi78@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 93,
        "username": "salvador.hamill",
        "primaryemail": "shane.kautzer@hotmail.com",
        "useremails": [
            {
                "useremailid": 94,
                "useremail": "rxzp70@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 95,
        "username": "beula.nienow",
        "primaryemail": "clayton.kemmer@hotmail.com",
        "useremails": [
            {
                "useremailid": 96,
                "useremail": "hxij12@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 97,
        "username": "shera.moen",
        "primaryemail": "levi.smitham@gmail.com",
        "useremails": [
            {
                "useremailid": 98,
                "useremail": "ijxu00@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 99,
        "username": "lamar.glover",
        "primaryemail": "otha.lemke@hotmail.com",
        "useremails": [
            {
                "useremailid": 100,
                "useremail": "bszy85@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 101,
        "username": "lyman.medhurst",
        "primaryemail": "maryln.larkin@yahoo.com",
        "useremails": [
            {
                "useremailid": 102,
                "useremail": "chdt33@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 103,
        "username": "shaina.sporer",
        "primaryemail": "raleigh.kris@hotmail.com",
        "useremails": [
            {
                "useremailid": 104,
                "useremail": "tfge95@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 105,
        "username": "petronila.kulas",
        "primaryemail": "kathline.hilpert@hotmail.com",
        "useremails": [
            {
                "useremailid": 106,
                "useremail": "oxnz87@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 107,
        "username": "burl.towne",
        "primaryemail": "krishna.pouros@gmail.com",
        "useremails": [
            {
                "useremailid": 108,
                "useremail": "pcnt06@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 109,
        "username": "rick.kovacek",
        "primaryemail": "hallie.bogisich@hotmail.com",
        "useremails": [
            {
                "useremailid": 110,
                "useremail": "dhpn57@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 111,
        "username": "jacalyn.greenholt",
        "primaryemail": "celesta.pollich@yahoo.com",
        "useremails": [
            {
                "useremailid": 112,
                "useremail": "qewp88@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 113,
        "username": "garry.mccullough",
        "primaryemail": "mirta.beer@gmail.com",
        "useremails": [
            {
                "useremailid": 114,
                "useremail": "xhag33@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 115,
        "username": "lore.block",
        "primaryemail": "maryrose.gleichner@yahoo.com",
        "useremails": [
            {
                "useremailid": 116,
                "useremail": "glua70@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 117,
        "username": "hyman.bartoletti",
        "primaryemail": "mauro.kohler@gmail.com",
        "useremails": [
            {
                "useremailid": 118,
                "useremail": "awab69@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 119,
        "username": "bennie.waters",
        "primaryemail": "patria.bergnaum@yahoo.com",
        "useremails": [
            {
                "useremailid": 120,
                "useremail": "znui92@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 121,
        "username": "ana.casper",
        "primaryemail": "malika.reynolds@gmail.com",
        "useremails": [
            {
                "useremailid": 122,
                "useremail": "htfz95@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 123,
        "username": "phung.jacobson",
        "primaryemail": "wenona.nicolas@gmail.com",
        "useremails": [
            {
                "useremailid": 124,
                "useremail": "bpym81@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 125,
        "username": "ping.koelpin",
        "primaryemail": "karoline.mayer@yahoo.com",
        "useremails": [
            {
                "useremailid": 126,
                "useremail": "vipr18@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 127,
        "username": "royce.hansen",
        "primaryemail": "tasia.daugherty@gmail.com",
        "useremails": [
            {
                "useremailid": 128,
                "useremail": "kego24@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 129,
        "username": "loura.reichel",
        "primaryemail": "zane.prosacco@hotmail.com",
        "useremails": [
            {
                "useremailid": 130,
                "useremail": "koba70@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 131,
        "username": "tom.turner",
        "primaryemail": "porsche.nolan@yahoo.com",
        "useremails": [
            {
                "useremailid": 132,
                "useremail": "plnp53@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 133,
        "username": "tillie.rohan",
        "primaryemail": "arthur.kulas@hotmail.com",
        "useremails": [
            {
                "useremailid": 134,
                "useremail": "odbe01@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 135,
        "username": "zachariah.okeefe",
        "primaryemail": "cornell.kreiger@gmail.com",
        "useremails": [
            {
                "useremailid": 136,
                "useremail": "xabn70@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 137,
        "username": "jeanene.williamson",
        "primaryemail": "mitch.dickens@hotmail.com",
        "useremails": [
            {
                "useremailid": 138,
                "useremail": "tmpb40@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 139,
        "username": "danial.donnelly",
        "primaryemail": "grant.lemke@hotmail.com",
        "useremails": [
            {
                "useremailid": 140,
                "useremail": "msmt18@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 141,
        "username": "jared.mitchell",
        "primaryemail": "will.windler@gmail.com",
        "useremails": [
            {
                "useremailid": 142,
                "useremail": "acsa19@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 143,
        "username": "martin.tromp",
        "primaryemail": "justin.parisian@gmail.com",
        "useremails": [
            {
                "useremailid": 144,
                "useremail": "husp88@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 145,
        "username": "young.okuneva",
        "primaryemail": "nancee.dibbert@gmail.com",
        "useremails": [
            {
                "useremailid": 146,
                "useremail": "igpk35@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 147,
        "username": "theron.kulas",
        "primaryemail": "kendrick.hermann@yahoo.com",
        "useremails": [
            {
                "useremailid": 148,
                "useremail": "jris05@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 149,
        "username": "pauline.doyle",
        "primaryemail": "reyna.west@gmail.com",
        "useremails": [
            {
                "useremailid": 150,
                "useremail": "snmi25@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 151,
        "username": "chung.cummings",
        "primaryemail": "gita.schaden@gmail.com",
        "useremails": [
            {
                "useremailid": 152,
                "useremail": "swwv26@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 153,
        "username": "chad.davis",
        "primaryemail": "emmett.wyman@hotmail.com",
        "useremails": [
            {
                "useremailid": 154,
                "useremail": "mani92@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 155,
        "username": "melony.mcdermott",
        "primaryemail": "deandre.yundt@yahoo.com",
        "useremails": [
            {
                "useremailid": 156,
                "useremail": "xbjv23@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 157,
        "username": "trevor.cruickshank",
        "primaryemail": "melia.lakin@gmail.com",
        "useremails": [
            {
                "useremailid": 158,
                "useremail": "srxc46@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 159,
        "username": "louis.harris",
        "primaryemail": "lyndsey.medhurst@hotmail.com",
        "useremails": [
            {
                "useremailid": 160,
                "useremail": "vasm73@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 161,
        "username": "robin.muller",
        "primaryemail": "grayce.waters@gmail.com",
        "useremails": [
            {
                "useremailid": 162,
                "useremail": "hmvz98@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 163,
        "username": "delcie.haley",
        "primaryemail": "connie.fay@yahoo.com",
        "useremails": [
            {
                "useremailid": 164,
                "useremail": "iqjc59@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 165,
        "username": "rolf.stamm",
        "primaryemail": "valorie.gottlieb@hotmail.com",
        "useremails": [
            {
                "useremailid": 166,
                "useremail": "vizb39@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 167,
        "username": "carol.zemlak",
        "primaryemail": "darryl.schneider@hotmail.com",
        "useremails": [
            {
                "useremailid": 168,
                "useremail": "ucqu57@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 169,
        "username": "matthew.larson",
        "primaryemail": "megan.ryan@gmail.com",
        "useremails": [
            {
                "useremailid": 170,
                "useremail": "dbxb99@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 171,
        "username": "elliott.ziemann",
        "primaryemail": "sharee.spencer@hotmail.com",
        "useremails": [
            {
                "useremailid": 172,
                "useremail": "gkkd51@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 173,
        "username": "mercedes.brown",
        "primaryemail": "chere.torp@yahoo.com",
        "useremails": [
            {
                "useremailid": 174,
                "useremail": "msid12@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 175,
        "username": "alysha.douglas",
        "primaryemail": "bradford.dietrich@hotmail.com",
        "useremails": [
            {
                "useremailid": 176,
                "useremail": "fxpv21@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 177,
        "username": "mirian.fahey",
        "primaryemail": "jules.conroy@yahoo.com",
        "useremails": [
            {
                "useremailid": 178,
                "useremail": "eqhu66@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 179,
        "username": "thomasina.cassin",
        "primaryemail": "alfredo.stoltenberg@gmail.com",
        "useremails": [
            {
                "useremailid": 180,
                "useremail": "pkxp63@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 181,
        "username": "tereasa.rohan",
        "primaryemail": "eda.collier@gmail.com",
        "useremails": [
            {
                "useremailid": 182,
                "useremail": "nkkv66@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 183,
        "username": "valentine.bergstrom",
        "primaryemail": "patricia.lueilwitz@hotmail.com",
        "useremails": [
            {
                "useremailid": 184,
                "useremail": "ahem48@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 185,
        "username": "lesia.murphy",
        "primaryemail": "cristobal.stoltenberg@gmail.com",
        "useremails": [
            {
                "useremailid": 186,
                "useremail": "arcr87@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 187,
        "username": "hollis.gorczany",
        "primaryemail": "leia.hilll@gmail.com",
        "useremails": [
            {
                "useremailid": 188,
                "useremail": "bmaj64@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 189,
        "username": "phil.swift",
        "primaryemail": "julius.goodwin@hotmail.com",
        "useremails": [
            {
                "useremailid": 190,
                "useremail": "koan11@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 191,
        "username": "rosendo.mohr",
        "primaryemail": "chloe.larkin@yahoo.com",
        "useremails": [
            {
                "useremailid": 192,
                "useremail": "uiso01@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 193,
        "username": "denny.gusikowski",
        "primaryemail": "emanuel.spinka@yahoo.com",
        "useremails": [
            {
                "useremailid": 194,
                "useremail": "ccxn20@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 195,
        "username": "johnathon.littel",
        "primaryemail": "fabian.kovacek@yahoo.com",
        "useremails": [
            {
                "useremailid": 196,
                "useremail": "ylhl70@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 197,
        "username": "pinkie.ferry",
        "primaryemail": "harriette.hahn@yahoo.com",
        "useremails": [
            {
                "useremailid": 198,
                "useremail": "tgjq90@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 199,
        "username": "nicki.jast",
        "primaryemail": "stewart.nicolas@hotmail.com",
        "useremails": [
            {
                "useremailid": 200,
                "useremail": "jicv63@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 201,
        "username": "diamond.gutmann",
        "primaryemail": "john.doyle@hotmail.com",
        "useremails": [
            {
                "useremailid": 202,
                "useremail": "pgtd99@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 203,
        "username": "peter.rice",
        "primaryemail": "suzette.oconner@hotmail.com",
        "useremails": [
            {
                "useremailid": 204,
                "useremail": "wcmc06@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 205,
        "username": "efren.gerlach",
        "primaryemail": "jonas.schroeder@hotmail.com",
        "useremails": [
            {
                "useremailid": 206,
                "useremail": "kupa35@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 207,
        "username": "craig.volkman",
        "primaryemail": "bill.hane@hotmail.com",
        "useremails": [
            {
                "useremailid": 208,
                "useremail": "dusz62@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 209,
        "username": "kera.mills",
        "primaryemail": "patrick.spinka@yahoo.com",
        "useremails": [
            {
                "useremailid": 210,
                "useremail": "hllv24@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 211,
        "username": "melvin.funk",
        "primaryemail": "trinity.crooks@hotmail.com",
        "useremails": [
            {
                "useremailid": 212,
                "useremail": "vgiu66@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 213,
        "username": "cristy.kilback",
        "primaryemail": "napoleon.skiles@hotmail.com",
        "useremails": [
            {
                "useremailid": 214,
                "useremail": "xebt86@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
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
            "role": {
                "roleid": 2,
                "name": "MOJO"
            }
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
            "role": {
                "roleid": 2,
                "name": "MOJO"
            }
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
        "userid": 39,
        "username": "denice.adams",
        "primaryemail": "gaston.hills@hotmail.com",
        "useremails": [
            {
                "useremailid": 40,
                "useremail": "nmqw03@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 139,
        "username": "danial.donnelly",
        "primaryemail": "grant.lemke@hotmail.com",
        "useremails": [
            {
                "useremailid": 140,
                "useremail": "msmt18@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
            }
        ]
    },
    {
        "userid": 153,
        "username": "chad.davis",
        "primaryemail": "emmett.wyman@hotmail.com",
        "useremails": [
            {
                "useremailid": 154,
                "useremail": "mani92@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "MOJO"
                }
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

---

***New Endpoints for this Version***

<details>
<summary>DELETE localhost:2019/roles/role/3</summary>

```TEXT
No Body Data

Status OK
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
No Body Data

Status OK
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
No Body Data

Status OK
```

</details>

<details>
<summary>http://localhost:2019/users/user/email/count</summary>

```JSON
[
    {
        "usernamerpt": "admin",
        "countemails": 2
    },
    {
        "usernamerpt": "alfred.crona",
        "countemails": 1
    },
    {
        "usernamerpt": "alysha.douglas",
        "countemails": 1
    },
    {
        "usernamerpt": "ammie.nader",
        "countemails": 1
    },
    {
        "usernamerpt": "ana.casper",
        "countemails": 1
    },
    {
        "usernamerpt": "austin.hills",
        "countemails": 1
    },
    {
        "usernamerpt": "barnbarn",
        "countemails": 1
    },
    {
        "usernamerpt": "beatris.becker",
        "countemails": 1
    },
    {
        "usernamerpt": "bennie.waters",
        "countemails": 1
    },
    {
        "usernamerpt": "beula.nienow",
        "countemails": 1
    },
    {
        "usernamerpt": "bruno.ullrich",
        "countemails": 1
    },
    {
        "usernamerpt": "burl.towne",
        "countemails": 1
    },
    {
        "usernamerpt": "carmine.schinner",
        "countemails": 1
    },
    {
        "usernamerpt": "carol.zemlak",
        "countemails": 1
    },
    {
        "usernamerpt": "cesar.miller",
        "countemails": 1
    },
    {
        "usernamerpt": "chad.davis",
        "countemails": 1
    },
    {
        "usernamerpt": "charlena.wisoky",
        "countemails": 1
    },
    {
        "usernamerpt": "chelsie.pollich",
        "countemails": 1
    },
    {
        "usernamerpt": "chung.cummings",
        "countemails": 1
    },
    {
        "usernamerpt": "cinabun",
        "countemails": 3
    },
    {
        "usernamerpt": "cory.kiehn",
        "countemails": 1
    },
    {
        "usernamerpt": "craig.volkman",
        "countemails": 1
    },
    {
        "usernamerpt": "cristy.kilback",
        "countemails": 1
    },
    {
        "usernamerpt": "danial.donnelly",
        "countemails": 1
    },
    {
        "usernamerpt": "delcie.haley",
        "countemails": 1
    },
    {
        "usernamerpt": "demetra.hegmann",
        "countemails": 1
    },
    {
        "usernamerpt": "denice.adams",
        "countemails": 1
    },
    {
        "usernamerpt": "denny.gusikowski",
        "countemails": 1
    },
    {
        "usernamerpt": "devona.trantow",
        "countemails": 1
    },
    {
        "usernamerpt": "diamond.gutmann",
        "countemails": 1
    },
    {
        "usernamerpt": "eduardo.von",
        "countemails": 1
    },
    {
        "usernamerpt": "efren.gerlach",
        "countemails": 1
    },
    {
        "usernamerpt": "elliott.ziemann",
        "countemails": 1
    },
    {
        "usernamerpt": "garry.mccullough",
        "countemails": 1
    },
    {
        "usernamerpt": "hollis.gorczany",
        "countemails": 1
    },
    {
        "usernamerpt": "hyman.bartoletti",
        "countemails": 1
    },
    {
        "usernamerpt": "jacalyn.greenholt",
        "countemails": 1
    },
    {
        "usernamerpt": "jamel.reilly",
        "countemails": 1
    },
    {
        "usernamerpt": "jared.mitchell",
        "countemails": 1
    },
    {
        "usernamerpt": "jarrett.howell",
        "countemails": 1
    },
    {
        "usernamerpt": "jeanene.williamson",
        "countemails": 1
    },
    {
        "usernamerpt": "jeremy.zemlak",
        "countemails": 1
    },
    {
        "usernamerpt": "johnathon.littel",
        "countemails": 1
    },
    {
        "usernamerpt": "josef.ohara",
        "countemails": 1
    },
    {
        "usernamerpt": "kacey.dicki",
        "countemails": 1
    },
    {
        "usernamerpt": "kamala.gerlach",
        "countemails": 1
    },
    {
        "usernamerpt": "kera.mills",
        "countemails": 1
    },
    {
        "usernamerpt": "lamar.glover",
        "countemails": 1
    },
    {
        "usernamerpt": "latrice.goldner",
        "countemails": 1
    },
    {
        "usernamerpt": "laveta.pfeffer",
        "countemails": 1
    },
    {
        "usernamerpt": "lesia.murphy",
        "countemails": 1
    },
    {
        "usernamerpt": "lore.block",
        "countemails": 1
    },
    {
        "usernamerpt": "louis.harris",
        "countemails": 1
    },
    {
        "usernamerpt": "loura.reichel",
        "countemails": 1
    },
    {
        "usernamerpt": "luther.bednar",
        "countemails": 1
    },
    {
        "usernamerpt": "lyman.medhurst",
        "countemails": 1
    },
    {
        "usernamerpt": "marilu.gleichner",
        "countemails": 1
    },
    {
        "usernamerpt": "martin.tromp",
        "countemails": 1
    },
    {
        "usernamerpt": "matthew.larson",
        "countemails": 1
    },
    {
        "usernamerpt": "maud.franecki",
        "countemails": 1
    },
    {
        "usernamerpt": "melony.mcdermott",
        "countemails": 1
    },
    {
        "usernamerpt": "melvin.funk",
        "countemails": 1
    },
    {
        "usernamerpt": "mercedes.brown",
        "countemails": 1
    },
    {
        "usernamerpt": "mirian.fahey",
        "countemails": 1
    },
    {
        "usernamerpt": "mojo",
        "countemails": 2
    },
    {
        "usernamerpt": "nicholas.auer",
        "countemails": 1
    },
    {
        "usernamerpt": "nicki.jast",
        "countemails": 1
    },
    {
        "usernamerpt": "oren.feeney",
        "countemails": 1
    },
    {
        "usernamerpt": "otto.kub",
        "countemails": 1
    },
    {
        "usernamerpt": "pauline.doyle",
        "countemails": 1
    },
    {
        "usernamerpt": "peter.rice",
        "countemails": 1
    },
    {
        "usernamerpt": "petronila.kulas",
        "countemails": 1
    },
    {
        "usernamerpt": "phil.swift",
        "countemails": 1
    },
    {
        "usernamerpt": "phung.jacobson",
        "countemails": 1
    },
    {
        "usernamerpt": "ping.koelpin",
        "countemails": 1
    },
    {
        "usernamerpt": "pinkie.ferry",
        "countemails": 1
    },
    {
        "usernamerpt": "reinaldo.jacobson",
        "countemails": 1
    },
    {
        "usernamerpt": "ricardo.macejkovic",
        "countemails": 1
    },
    {
        "usernamerpt": "rick.kovacek",
        "countemails": 1
    },
    {
        "usernamerpt": "robin.muller",
        "countemails": 1
    },
    {
        "usernamerpt": "rodger.oberbrunner",
        "countemails": 1
    },
    {
        "usernamerpt": "rolf.stamm",
        "countemails": 1
    },
    {
        "usernamerpt": "rosendo.mohr",
        "countemails": 1
    },
    {
        "usernamerpt": "rowena.upton",
        "countemails": 1
    },
    {
        "usernamerpt": "royce.hansen",
        "countemails": 1
    },
    {
        "usernamerpt": "salvador.hamill",
        "countemails": 1
    },
    {
        "usernamerpt": "scot.ratke",
        "countemails": 1
    },
    {
        "usernamerpt": "shaina.sporer",
        "countemails": 1
    },
    {
        "usernamerpt": "shera.moen",
        "countemails": 1
    },
    {
        "usernamerpt": "simonne.schumm",
        "countemails": 1
    },
    {
        "usernamerpt": "steven.baumbach",
        "countemails": 1
    },
    {
        "usernamerpt": "stubs",
        "countemails": 2
    },
    {
        "usernamerpt": "tereasa.rohan",
        "countemails": 1
    },
    {
        "usernamerpt": "theron.kulas",
        "countemails": 1
    },
    {
        "usernamerpt": "thomasina.cassin",
        "countemails": 1
    },
    {
        "usernamerpt": "tillie.rohan",
        "countemails": 1
    },
    {
        "usernamerpt": "tom.turner",
        "countemails": 1
    },
    {
        "usernamerpt": "toney.zulauf",
        "countemails": 1
    },
    {
        "usernamerpt": "trevor.cruickshank",
        "countemails": 1
    },
    {
        "usernamerpt": "valentine.bergstrom",
        "countemails": 1
    },
    {
        "usernamerpt": "winford.schinner",
        "countemails": 1
    },
    {
        "usernamerpt": "yasmine.cole",
        "countemails": 1
    },
    {
        "usernamerpt": "young.okuneva",
        "countemails": 1
    },
    {
        "usernamerpt": "zachariah.okeefe",
        "countemails": 1
    }
]
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/7/role/2</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>POST http://localhost:2019/users/user/15/role/1</summary>

```TEXT
No Body Data

No Location Header
Status 201 Created
```

</details>

<details>
<summary>http://localhost:2019/useremails/username/cinabun</summary>

```JSON
[
    {
        "useremailid": 222,
        "useremail": "cinnamon@mymail.home",
        "user": {
            "userid": 7,
            "username": "cinabun",
            "primaryemail": "cinabun@lambdaschool.home",
            "roles": []
        }
    },
    {
        "useremailid": 223,
        "useremail": "hops@mymail.home",
        "user": {
            "userid": 7,
            "username": "cinabun",
            "primaryemail": "cinabun@lambdaschool.home",
            "roles": []
        }
    },
    {
        "useremailid": 224,
        "useremail": "bunny@email.home",
        "user": {
            "userid": 7,
            "username": "cinabun",
            "primaryemail": "cinabun@lambdaschool.home",
            "roles": []
        }
    }
]
```

</details>

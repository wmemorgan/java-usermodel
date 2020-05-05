# Java User Model Initial Version

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the application's data. This application will also form the basis of a user authentication application developed elsewhere in the course

### Database layout

The table layout is as follows

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

Same layout, same functions, different data! This is a common feature among backend API systems. They are all very similar but with their own data!

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
        "useremail": "dick33@gmail.com",
        "user": {
            "userid": 15,
            "username": "natashia.greenholt",
            "primaryemail": "reynaldo.yundt@gmail.com",
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
        "useremail": "bcle86@gmail.com",
        "user": {
            "userid": 17,
            "username": "keven.runte",
            "primaryemail": "ching.feeney@gmail.com",
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
        "useremail": "tnys82@gmail.com",
        "user": {
            "userid": 19,
            "username": "mario.reichert",
            "primaryemail": "gabriel.zieme@yahoo.com",
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
        "useremail": "nzke86@gmail.com",
        "user": {
            "userid": 21,
            "username": "francoise.abbott",
            "primaryemail": "ahmed.tremblay@hotmail.com",
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
        "useremail": "oaei98@gmail.com",
        "user": {
            "userid": 23,
            "username": "noah.dubuque",
            "primaryemail": "roman.boyle@yahoo.com",
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
        "useremail": "urdp98@gmail.com",
        "user": {
            "userid": 25,
            "username": "ernest.lang",
            "primaryemail": "german.huel@yahoo.com",
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
        "useremail": "kxth96@gmail.com",
        "user": {
            "userid": 27,
            "username": "altha.monahan",
            "primaryemail": "kraig.fay@hotmail.com",
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
        "useremail": "itju38@gmail.com",
        "user": {
            "userid": 29,
            "username": "chantelle.turcotte",
            "primaryemail": "steven.leuschke@yahoo.com",
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
        "useremail": "rbmv96@gmail.com",
        "user": {
            "userid": 31,
            "username": "abigail.fahey",
            "primaryemail": "toby.ratke@yahoo.com",
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
        "useremail": "umqj01@gmail.com",
        "user": {
            "userid": 33,
            "username": "caroll.bogan",
            "primaryemail": "barney.smitham@gmail.com",
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
        "useremail": "wsub13@gmail.com",
        "user": {
            "userid": 35,
            "username": "deedee.keeling",
            "primaryemail": "santos.okeefe@hotmail.com",
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
        "useremail": "tngb60@gmail.com",
        "user": {
            "userid": 37,
            "username": "derrick.greenfelder",
            "primaryemail": "conrad.johnston@gmail.com",
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
        "useremail": "geke42@gmail.com",
        "user": {
            "userid": 39,
            "username": "terrance.padberg",
            "primaryemail": "jean.west@yahoo.com",
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
        "useremail": "fzwk37@gmail.com",
        "user": {
            "userid": 41,
            "username": "monte.franecki",
            "primaryemail": "tommie.schulist@hotmail.com",
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
        "useremail": "ixxn33@gmail.com",
        "user": {
            "userid": 43,
            "username": "scarlet.osinski",
            "primaryemail": "emory.bartell@gmail.com",
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
        "useremail": "aymi27@gmail.com",
        "user": {
            "userid": 45,
            "username": "raymon.hirthe",
            "primaryemail": "randa.mante@hotmail.com",
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
        "useremail": "swhg68@gmail.com",
        "user": {
            "userid": 47,
            "username": "floyd.larkin",
            "primaryemail": "blanch.grant@yahoo.com",
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
        "useremail": "skhd99@gmail.com",
        "user": {
            "userid": 49,
            "username": "werner.rowe",
            "primaryemail": "fred.rohan@hotmail.com",
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
        "useremail": "mgam63@gmail.com",
        "user": {
            "userid": 51,
            "username": "beulah.turcotte",
            "primaryemail": "kasey.prohaska@hotmail.com",
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
        "useremail": "ymkd24@gmail.com",
        "user": {
            "userid": 53,
            "username": "jack.boyle",
            "primaryemail": "mitchel.torp@hotmail.com",
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
        "useremail": "tojt89@gmail.com",
        "user": {
            "userid": 55,
            "username": "elvis.franecki",
            "primaryemail": "malinda.howe@gmail.com",
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
        "useremail": "psfi35@gmail.com",
        "user": {
            "userid": 57,
            "username": "junior.farrell",
            "primaryemail": "chassidy.balistreri@hotmail.com",
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
        "useremail": "wisj87@gmail.com",
        "user": {
            "userid": 59,
            "username": "german.prosacco",
            "primaryemail": "domenic.von@hotmail.com",
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
        "useremail": "dmaz05@gmail.com",
        "user": {
            "userid": 61,
            "username": "tara.ratke",
            "primaryemail": "larissa.olson@yahoo.com",
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
        "useremail": "woul46@gmail.com",
        "user": {
            "userid": 63,
            "username": "morton.heidenreich",
            "primaryemail": "darius.wiegand@gmail.com",
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
    "timestamp": "2020-03-17T19:35:25.698+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "Useremail with id 8888 Not Found!",
    "trace": "javax.persistence.EntityNotFoundException: Useremail with id 8888 Not Found!\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.lambda$findUseremailById$0(UseremailServiceImpl.java:51)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:408)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.findUseremailById(UseremailServiceImpl.java:51)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$FastClassBySpringCGLIB$$f1b1885e.invoke(<generated>)\n\tat org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:769)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:366)\n\tat org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:99)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:689)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$EnhancerBySpringCGLIB$$366aa8ec.findUseremailById(<generated>)\n\tat com.lambdaschool.usermodel.controllers.UseremailController.getUserEmailById(UseremailController.java:57)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:879)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:634)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:541)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:367)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1639)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:834)\n",
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

Location Header: http://localhost:2019/useremails/useremail/65
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
                "username": "natashia.greenholt",
                "primaryemail": "reynaldo.yundt@gmail.com",
                "useremails": [
                    {
                        "useremailid": 16,
                        "useremail": "dick33@gmail.com"
                    },
                    {
                        "useremailid": 65,
                        "useremail": "favbun@hops.local"
                    }
                ]
            },
            {
                "userid": 17,
                "username": "keven.runte",
                "primaryemail": "ching.feeney@gmail.com",
                "useremails": [
                    {
                        "useremailid": 18,
                        "useremail": "bcle86@gmail.com"
                    }
                ]
            },
            {
                "userid": 19,
                "username": "mario.reichert",
                "primaryemail": "gabriel.zieme@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 20,
                        "useremail": "tnys82@gmail.com"
                    }
                ]
            },
            {
                "userid": 21,
                "username": "francoise.abbott",
                "primaryemail": "ahmed.tremblay@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 22,
                        "useremail": "nzke86@gmail.com"
                    }
                ]
            },
            {
                "userid": 23,
                "username": "noah.dubuque",
                "primaryemail": "roman.boyle@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 24,
                        "useremail": "oaei98@gmail.com"
                    }
                ]
            },
            {
                "userid": 25,
                "username": "ernest.lang",
                "primaryemail": "german.huel@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 26,
                        "useremail": "urdp98@gmail.com"
                    }
                ]
            },
            {
                "userid": 27,
                "username": "altha.monahan",
                "primaryemail": "kraig.fay@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 28,
                        "useremail": "kxth96@gmail.com"
                    }
                ]
            },
            {
                "userid": 29,
                "username": "chantelle.turcotte",
                "primaryemail": "steven.leuschke@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 30,
                        "useremail": "itju38@gmail.com"
                    }
                ]
            },
            {
                "userid": 31,
                "username": "abigail.fahey",
                "primaryemail": "toby.ratke@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 32,
                        "useremail": "rbmv96@gmail.com"
                    }
                ]
            },
            {
                "userid": 33,
                "username": "caroll.bogan",
                "primaryemail": "barney.smitham@gmail.com",
                "useremails": [
                    {
                        "useremailid": 34,
                        "useremail": "umqj01@gmail.com"
                    }
                ]
            },
            {
                "userid": 35,
                "username": "deedee.keeling",
                "primaryemail": "santos.okeefe@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 36,
                        "useremail": "wsub13@gmail.com"
                    }
                ]
            },
            {
                "userid": 37,
                "username": "derrick.greenfelder",
                "primaryemail": "conrad.johnston@gmail.com",
                "useremails": [
                    {
                        "useremailid": 38,
                        "useremail": "tngb60@gmail.com"
                    }
                ]
            },
            {
                "userid": 39,
                "username": "terrance.padberg",
                "primaryemail": "jean.west@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 40,
                        "useremail": "geke42@gmail.com"
                    }
                ]
            },
            {
                "userid": 41,
                "username": "monte.franecki",
                "primaryemail": "tommie.schulist@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 42,
                        "useremail": "fzwk37@gmail.com"
                    }
                ]
            },
            {
                "userid": 43,
                "username": "scarlet.osinski",
                "primaryemail": "emory.bartell@gmail.com",
                "useremails": [
                    {
                        "useremailid": 44,
                        "useremail": "ixxn33@gmail.com"
                    }
                ]
            },
            {
                "userid": 45,
                "username": "raymon.hirthe",
                "primaryemail": "randa.mante@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 46,
                        "useremail": "aymi27@gmail.com"
                    }
                ]
            },
            {
                "userid": 47,
                "username": "floyd.larkin",
                "primaryemail": "blanch.grant@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 48,
                        "useremail": "swhg68@gmail.com"
                    }
                ]
            },
            {
                "userid": 49,
                "username": "werner.rowe",
                "primaryemail": "fred.rohan@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 50,
                        "useremail": "skhd99@gmail.com"
                    }
                ]
            },
            {
                "userid": 51,
                "username": "beulah.turcotte",
                "primaryemail": "kasey.prohaska@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 52,
                        "useremail": "mgam63@gmail.com"
                    }
                ]
            },
            {
                "userid": 53,
                "username": "jack.boyle",
                "primaryemail": "mitchel.torp@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 54,
                        "useremail": "ymkd24@gmail.com"
                    }
                ]
            },
            {
                "userid": 55,
                "username": "elvis.franecki",
                "primaryemail": "malinda.howe@gmail.com",
                "useremails": [
                    {
                        "useremailid": 56,
                        "useremail": "tojt89@gmail.com"
                    }
                ]
            },
            {
                "userid": 57,
                "username": "junior.farrell",
                "primaryemail": "chassidy.balistreri@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 58,
                        "useremail": "psfi35@gmail.com"
                    }
                ]
            },
            {
                "userid": 59,
                "username": "german.prosacco",
                "primaryemail": "domenic.von@hotmail.com",
                "useremails": [
                    {
                        "useremailid": 60,
                        "useremail": "wisj87@gmail.com"
                    }
                ]
            },
            {
                "userid": 61,
                "username": "tara.ratke",
                "primaryemail": "larissa.olson@yahoo.com",
                "useremails": [
                    {
                        "useremailid": 62,
                        "useremail": "dmaz05@gmail.com"
                    }
                ]
            },
            {
                "userid": 63,
                "username": "morton.heidenreich",
                "primaryemail": "darius.wiegand@gmail.com",
                "useremails": [
                    {
                        "useremailid": 64,
                        "useremail": "woul46@gmail.com"
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
No Body Data

Location Header: http://localhost:2019/roles/role/66
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
        "username": "natashia.greenholt",
        "primaryemail": "reynaldo.yundt@gmail.com",
        "useremails": [
            {
                "useremailid": 16,
                "useremail": "dick33@gmail.com"
            },
            {
                "useremailid": 65,
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
        "username": "keven.runte",
        "primaryemail": "ching.feeney@gmail.com",
        "useremails": [
            {
                "useremailid": 18,
                "useremail": "bcle86@gmail.com"
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
        "username": "mario.reichert",
        "primaryemail": "gabriel.zieme@yahoo.com",
        "useremails": [
            {
                "useremailid": 20,
                "useremail": "tnys82@gmail.com"
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
        "username": "francoise.abbott",
        "primaryemail": "ahmed.tremblay@hotmail.com",
        "useremails": [
            {
                "useremailid": 22,
                "useremail": "nzke86@gmail.com"
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
        "username": "noah.dubuque",
        "primaryemail": "roman.boyle@yahoo.com",
        "useremails": [
            {
                "useremailid": 24,
                "useremail": "oaei98@gmail.com"
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
        "username": "ernest.lang",
        "primaryemail": "german.huel@yahoo.com",
        "useremails": [
            {
                "useremailid": 26,
                "useremail": "urdp98@gmail.com"
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
        "username": "altha.monahan",
        "primaryemail": "kraig.fay@hotmail.com",
        "useremails": [
            {
                "useremailid": 28,
                "useremail": "kxth96@gmail.com"
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
        "username": "chantelle.turcotte",
        "primaryemail": "steven.leuschke@yahoo.com",
        "useremails": [
            {
                "useremailid": 30,
                "useremail": "itju38@gmail.com"
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
        "username": "abigail.fahey",
        "primaryemail": "toby.ratke@yahoo.com",
        "useremails": [
            {
                "useremailid": 32,
                "useremail": "rbmv96@gmail.com"
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
        "username": "caroll.bogan",
        "primaryemail": "barney.smitham@gmail.com",
        "useremails": [
            {
                "useremailid": 34,
                "useremail": "umqj01@gmail.com"
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
        "username": "deedee.keeling",
        "primaryemail": "santos.okeefe@hotmail.com",
        "useremails": [
            {
                "useremailid": 36,
                "useremail": "wsub13@gmail.com"
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
        "username": "derrick.greenfelder",
        "primaryemail": "conrad.johnston@gmail.com",
        "useremails": [
            {
                "useremailid": 38,
                "useremail": "tngb60@gmail.com"
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
        "username": "terrance.padberg",
        "primaryemail": "jean.west@yahoo.com",
        "useremails": [
            {
                "useremailid": 40,
                "useremail": "geke42@gmail.com"
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
        "username": "monte.franecki",
        "primaryemail": "tommie.schulist@hotmail.com",
        "useremails": [
            {
                "useremailid": 42,
                "useremail": "fzwk37@gmail.com"
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
        "username": "scarlet.osinski",
        "primaryemail": "emory.bartell@gmail.com",
        "useremails": [
            {
                "useremailid": 44,
                "useremail": "ixxn33@gmail.com"
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
        "username": "raymon.hirthe",
        "primaryemail": "randa.mante@hotmail.com",
        "useremails": [
            {
                "useremailid": 46,
                "useremail": "aymi27@gmail.com"
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
        "username": "floyd.larkin",
        "primaryemail": "blanch.grant@yahoo.com",
        "useremails": [
            {
                "useremailid": 48,
                "useremail": "swhg68@gmail.com"
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
        "username": "werner.rowe",
        "primaryemail": "fred.rohan@hotmail.com",
        "useremails": [
            {
                "useremailid": 50,
                "useremail": "skhd99@gmail.com"
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
        "username": "beulah.turcotte",
        "primaryemail": "kasey.prohaska@hotmail.com",
        "useremails": [
            {
                "useremailid": 52,
                "useremail": "mgam63@gmail.com"
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
        "username": "jack.boyle",
        "primaryemail": "mitchel.torp@hotmail.com",
        "useremails": [
            {
                "useremailid": 54,
                "useremail": "ymkd24@gmail.com"
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
        "username": "elvis.franecki",
        "primaryemail": "malinda.howe@gmail.com",
        "useremails": [
            {
                "useremailid": 56,
                "useremail": "tojt89@gmail.com"
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
        "username": "junior.farrell",
        "primaryemail": "chassidy.balistreri@hotmail.com",
        "useremails": [
            {
                "useremailid": 58,
                "useremail": "psfi35@gmail.com"
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
        "username": "german.prosacco",
        "primaryemail": "domenic.von@hotmail.com",
        "useremails": [
            {
                "useremailid": 60,
                "useremail": "wisj87@gmail.com"
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
        "username": "tara.ratke",
        "primaryemail": "larissa.olson@yahoo.com",
        "useremails": [
            {
                "useremailid": 62,
                "useremail": "dmaz05@gmail.com"
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
        "username": "morton.heidenreich",
        "primaryemail": "darius.wiegand@gmail.com",
        "useremails": [
            {
                "useremailid": 64,
                "useremail": "woul46@gmail.com"
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
[]
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

Location Header: http://localhost:2019/users/user/67
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
           "roleid": 3
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

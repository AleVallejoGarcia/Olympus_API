# Olympus API

## Description

Olympus is a comprehensive gym management API that handles data related to users, administrators, workout routines, exercises, user achievements, and muscle groups targeted by exercises. It is designed to help gym management systems efficiently manage their data and provide a better experience for users and administrators alike.

## Package Structure

The package structure is as follows:

- `src`: Inside you have all the classes of the project.
- `com`: Domain.
- `olympus`: Organization
- `controller`: Contains the class controllers.
- `database`: Contains the class that, when starting the API, puts predefined data into the database.
- `exception`: Contains a created exception that jumps with error 404.
- `models`: Inside are models for creating tables in the database and for returning data for logins.
- `repositories`: Contains the repositories of the model classes.
- `services`: Contains the services to relate the database.

# Models

### Package

package com.olympus.models;

### Annotations

> @Entity: Marks the class as a JPA-managed entity.

> @Table(name = "achievements"): Specifies the name of the table in the database.

> @Id: Mark the field as the primary key of the entity.

> @GeneratedValue(strategy = GenerationType.IDENTITY): Configure the primary key generation strategy.

> @Column(name = ""): Specifies the name of the column in the table.

> @Column(nullable = false, length = 200): Specifies the properties of the column.

> @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = ""): Specifies the column relationship.

> @OnDelete(action = OnDeleteAction.CASCADE): Specifies the action to take when deleting the associated entity.

> @JsonIgnore: Ignore this property during JSON serialization.

> @ManyToOne(fetch = FetchType. LAZY, optional = false): Specifies a many-to-one relationship to the MuscleZone entity.

> @JoinColumn(name = "", nullable = false): Specifies the join column in the database table.

> @JoinTable(name = ""): Specifies the name of the join table.

## Class Achievement

### Description

The Achievement class represents an achievement within the system. Each achievement has a description, an optional image URL, and a status indicating whether it has been awarded or not. In addition, it establishes a many-to-many relationship with the User entity.

### Attributes

> private long achievementId: ID of the achievement.

> private String achievementDescription: Description of the achievement.

> private String achievementUrlImage: URL of the image associated to the achievement.

> Private Boolean gived: Indicates if the achievement has been given.

> private Set<User> user = new HashSet<>();: Set of users associated with this achievement.

### Builders

public Achievement(): Default constructor.

Creates an empty instance of Achievement.

public Achievement(String achievementDescription, String achievementUrlImage): Constructor that receives the description and URL of the achievement image.

Parameters:

achievementDescription (String): The description of the achievement.
achievementUrlImage (String): The URL of the achievement image.

### Methods

> public Long getAchievementId(): Gets the ID of the achievement.

Returns: The ID of the achievement (Long).

> public void setAchievementId(Long achievementId): Sets the ID of the achievement.

Parameters:
achievementId (Long): The ID of the achievement.

> public String getAchievementDescription(): Get the description of the achievement.

Returns: The description of the achievement (String).

> public void setAchievementDescription(String achievementDescription): Sets the description of the achievement.

Parameters:
achievementDescription (String): The description of the achievement.

> public String getAchievementUrlImage(): Get the URL of the achievement image.

Returns: The URL of the achievement image (String).

> public void setAchievementUrlImage(String achievementUrlImage): Sets the URL of the achievement image.

Parameters:
achievementUrlImage (String): The URL of the achievement image.

> public Boolean getGived(): Gets the status of whether the achievement has been given.

Returns: The status of whether the achievement has been awarded (Boolean).

> public void setGived(Boolean gived): Sets the status of whether the achievement has been awarded.

Parameters:
gived (Boolean): The status of whether the achievement has been awarded.

> public Set<User> getUser(): Gets the set of users associated with the achievement.

Returns: The set of users (Set<User>).

> public void setUsers(Set<User> user): Sets the set of users associated with the achievement.

Parameters:
user (Set<User>): The set of users.

## Admin Class

### Description

The Admin class represents a system administrator. Each administrator has a name, a unique email address, and a password.

### Attributes

> private long adminId: ID of the administrator.

> private String adminName: Name of the administrator.

> private String adminMail: Administrator's email address (must be unique).

> private String adminPassword: Administrator password.

### Builders

> public Admin(): Default constructor. Creates an empty Admin instance.

> public Admin(String adminName, String adminMail, String adminPassword): Constructor that receives the name, email and password of the administrator.

Parameters:
adminName (String): The name of the administrator.
adminMail (String): The administrator's email address.
adminPassword (String): The password of the administrator.

### Methods

> public Long getAdminId(): Gets the ID of the administrator.

Returns: The administrator ID (Long).

> public void setId(Long id): Sets the ID of the administrator.

Parameters:
id (Long): The ID of the administrator.

> public String getAdminName(): Get the name of the administrator.

Returns: The name of the administrator (String).

> public void setAdminName(String adminName): Sets the name of the administrator.

Parameters:
adminName (String): The name of the administrator.

> public String getAdminMail(): Get the admin's email address.

Returns: The email address of the administrator (String).

> public void setAdminMail(String adminMail): Sets the admin email.

Parameters:
adminMail (String): The administrator's email address.

> public String getAdminPassword(): Get the administrator password.

Returns: The administrator password (String).

> public void setAdminPassword(String adminPassword): Sets the administrator password.

Parameters:
adminPassword (String): The password of the administrator.

## Exercise Class

### Description

The Exercise class represents an exercise within the system. Each exercise has a name, description, image URL, associated muscle area and may be associated with multiple routines.

### Attributes

> private long exerciseId: ID of the exercise.

> private String exerciseName: Name of the exercise.

> private String exerciseDescription: Description of the exercise.

> private String urlImage: URL of the exercise image.

> private MuscleZone muscleZone: A muscle area associated with this exercise.

> private Set<Routine> routines = new HashSet<>();: Set of routines associated with this exercise.

### Builders

> public Exercise(): Default constructor.

Creates an empty instance of Exercise.

> public Exercise(String exerciseName, String exerciseDescription, String urlImage): Constructor that receives the name, description, and URL of the exercise image.

Parameters:

exerciseName (String): The name of the exercise.

exerciseDescription (String): The description of the exercise.

urlImage (String): The URL of the exercise image.

### Methods

> public Long getExerciseId(): Get the ID of the exercise.

Returns: The ID of the exercise (Long).

> public void setId(Long id): Sets the ID of the exercise.

Parameters:
id (Long): The ID of the exercise.

> public String getExerciseName(): Get the name of the exercise.

Returns: The name of the exercise (String).

> public void setExerciseName(String exerciseName): Sets the name of the exercise.

Parameters:
exerciseName (String): The name of the exercise.

> public String getExerciseDescription(): Get the description of the exercise.

Returns: The description of the exercise (String).

> public void setExerciseDescription(String exerciseDescription): Sets the description of the exercise.

Parameters:
exerciseDescription (String): The description of the exercise.

> public String getUrlImage(): Get the URL of the exercise image.

Returns: The URL of the exercise image (String).

> public void setUrlImage(String urlImage): Sets the URL of the exercise image.

Parameters:
urlImage (String): The URL of the exercise image.

> public MuscleZone getMuscleZone(): Gets the muscle area associated with exercise.

Returns: The associated muscle zone (MuscleZone).

> public void setMuscleZone(MuscleZone muscleZone): Establishes the muscle zone associated with exercise.

Parameters:
muscleZone: The associated muscle zone.

> public Set<Routine> getRoutines(): Gets the set of routines associated with the exercise.

Returns: The set of routines (Set<Routine>).

> public void setRoutines(Set<Routine> routines): Sets the set of routines associated with the exercise.

Parameters:
routines (Set<Routine>): The set of routines.

## Class LoginAdminInformation

### Description

The LoginAdminInformation class represents the login information for an administrator. Includes the administrator's email and password.

### Attributes

> private String adminMail: Stores the administrator's email address.

> private String adminPassword: Stores the administrator password.

### Builders

> public LoginAdminInformation(): Default constructor.

Creates an empty instance of LoginAdminInformation.

> public LoginAdminInformation(String adminMail, String adminPassword): Constructor that receives the administrator's email and password.

### Parameters:

> adminMail (String): The administrator's email address.

> adminPassword (String): The password of the administrator.

### Methods

> public String getAdminMail(): Get the admin's email address.

Returns: The email address of the administrator (String).

> public void setAdminMail(String adminMail): Sets the admin email.

Parameters:
adminMail (String): The administrator's email address.

> public String getAdminPassword(): Get the administrator password.

Returns: The administrator password (String).

> public void setAdminPassword(String adminPassword): Sets the administrator password.

Parameters:
adminPassword (String): The password of the administrator.

## Class LoginUserInformation

### Description

The LoginUserInformation class represents the login information for a user. Includes the user's email and password.

### Attributes

> private String userMail: Stores the user's email.

> private String userPassword: Stores the user's password.

### Builders

> public LoginUserInformation(): Default constructor.

Creates an empty instance of LoginUserInformation.

> public LoginUserInformation(String userMail, String userPassword): Constructor that receives the user's email and password.

Parameters:
userMail (String): The user's email address.
userPassword (String): The password of the user.

### Methods

> public String getUserMail(): Get the user's email address.

Returns: The user's email address (String).

> public void setUserMail(String userMail): Sets the user's email address.

Parameters:
userMail (String): The user's email address.

> public String getUserPassword(): Get the user's password.

Returns: The user's password (String).

> public void setUserPassword(String userPassword): Sets the user's password.

Parameters:
userPassword (String): The password of the user.

## LoginUserReturnObject Class

### Description

The LoginUserReturnObject class represents the object returned after a user logs in. It includes the user ID, the user name, and an indication of whether the email and password provided are correct.

### Attributes

> private Long userId: Stores the user ID.

> private String userName: Stores the user name.

> private boolean mailAndPasswordAreCorrect: Indicates whether the email and password provided are correct.

### Builders

> public LoginUserReturnObject(): Default constructor.

Creates an empty instance of LoginUserReturnObject.

> public LoginUserReturnObject(Long userId, String userName, boolean mailAndPasswordAreCorrect): Constructor that receives the user ID, the user name, and an indication whether the provided email and password are correct.

Parameters:

userId (Long): The user ID.

userName (String): The name of the user.

mailAndPasswordAreCorrect (boolean): Indicates whether the

email and password provided are correct.

### Methods

> public Long getUserId(): Get the user ID.

Returns: The user ID (Long).

> public void setUserId(Long userId): Sets the user ID.

Parameters:
userId (Long): The user ID.

> public String getUserName(): Get the username.

Returns: The name of the user (String).

> public void setUserName(String userName): Sets the user name.

Parameters:
userName (String): The name of the user.

> public boolean getMailAndPasswordAreCorrect(): Get the indication if the email and password provided are correct.

Returns: true if the email and password are correct, false otherwise (boolean).

> public void setMailAndPasswordAreCorrect(boolean mailAndPasswordAreCorrect): Sets whether the email and password provided are correct.

Parameters:
mailAndPasswordAreCorrect (boolean): Indicates whether the e-mail and password are correct.

## MuscleZone Class

### Description

The MuscleZone class represents a muscle zone in the database. Includes the ID of the muscle area and the name of the muscle area.

### Attributes

> private long muscleZoneId: Stores the ID of the muscle zone.

> private String muscleName: Stores the name of the muscle zone.

### Builders

> public MuscleZone(): Default constructor.

Creates an empty instance of MuscleZone.

> public MuscleZone(String muscleName): Constructor that gets the name of the muscle zone.

Parameters:
muscleName (String): The name of the muscle zone.

### Methods

> public Long getMuscleZoneId(): Get the ID of the muscle zone.

Returns: The ID of the muscle area (Long).

> public void setMuscleZoneId(Long muscleZoneId): Sets the ID of the muscle zone.

Parameters:
muscleZoneId (Long): The ID of the muscle zone.

> public String getMuscleName(): Get the name of the muscle area.

Returns: The name of the muscle zone (String).

> public void setMuscleName(String muscleName): Sets the name of the muscle area.

Parameters:
muscleName (String): The name of the muscle zone.

## Class Routine

### Description

The Routine class represents an exercise routine in the database. It includes the routine ID, the name of the routine, the associated user, and the exercises included in the routine.

### Attributes

> private long routineId: Stores the ID of the routine.

> private String routineName: Stores the name of the routine.

> private User user: Represents the user associated with the routine.

> private Set<Exercise> exercises: Represents the exercises included in the routine.

### Builders

> public Routine(): Default constructor.

Create an empty instance of Routine.

> public Routine(String routineName): A constructor named after the routine.

Parameters:
routineName (String): The name of the routine.

### Methods

> public Long getRoutineId(): Gets the ID of the routine.

Returns: The ID of the routine (Long).

> public void setRoutineId(Long routineId): Sets the ID of the routine.

Parameters:
routineId (Long): The ID of the routine.

> public String getRoutineName(): Get the name of the routine.

Returns: The name of the routine (String).

> public void setRoutineName(String routineName): Sets the name of the routine.

Parameters:
routineName (String): The name of the routine.

> public User getUser(): Gets the user associated with the routine.

Returns: The associated user.

> public void setUser(User user): Sets the user associated with the routine.

Parameters:
user (User): The associated user.

> public Set<Exercise> getExercises(): Gets the exercises included in the routine.

Returns: The exercises included in the routine (Set<Exercise>).

> public void setExercises(Set<Exercise> exercises): Sets the exercises included in the routine.

Parameters:
exercises (Set<Exercise>): The exercises included in the routine.

## User Class

### Description

The User class represents a user in the database. It includes the user ID, the user name, the user's email, the user's password, the user's height, the user's weight, and the user's achievements.

### Attributes

> private long userId: Stores the user ID.

> private String userName: Stores the user name.

> private String userMail: Stores the user's email.

> private String userPassword: Stores the user's password.

> private float userHeight: Stores the user's height.

> private float userWeight: Stores the user's weight.

> private Set<Achievement> achievements: Represents the user's achievements.

### Builders

> public User(): Default constructor.

Creates an empty User instance.

> public User(String userName, String userMail, String userPassword, float userHeight, float userWeight): Constructor that receives the user name, user email, user password, user height, and user weight.

Parameters:

userName (String): The name of the user.

userMail (String): The user's email address.

userPassword (String): The password of the user.

userHeight (float): The height of the user.

userWeight (float): The weight of the user.

### Methods

> public Long getUserId(): Get the user ID.

Returns: The user ID (Long).

> public void setUserId(Long userId): Sets the user ID.

Parameters:
userId (Long): The user ID.

> public String getUserName(): Get the username.

Returns: The name of the user (String).

> public void setUserName(String userName): Sets the user name.

Parameters:
userName (String): The name of the user.

> public String getUserMail(): Get the user's email address.

Returns: The user's email address (String).

> public void setUserMail(String userMail): Sets the user's email address.

Parameters:
userMail (String): The user's email address.

> public String getUserPassword(): Get the user's password.

Returns: The user's password (String).

> public void setUserPassword(String userPassword): Sets the user's password.

Parameters:
userPassword (String): The password of the user.

> public float getUserHeight(): Gets the height of the user.

Returns: The height of the user (float).

> public void setUserHeight(float userHeight): Sets the height of the user.

Parameters:
userHeight (float): The height of the user.

> public float getUserWeight(): Gets the user's weight.

Returns: The user's weight (float).

> public void setUserWeight(float userWeight): Sets the user's weight.

Parameters:
userWeight (float): The user's weight.

> public Set<Achievement> getAchievements(): Obtains the user's achievements.

Returns: The user's achievements (Set<Achievement>).

> public void setAchievements(Set<Achievement> achievements): Sets the user's achievements.

Parameters:
achievements (Set<Achievement>): The user's achievements.

# Services

### Package

com.olympus.services

## Class ManyToManyService

### Description

The ManyToManyService class provides services to manage entities with many to many relationships, such as Exercise, Routine, User, and Achievement.

### Annotations

> @Service: Mark this class as a Spring service.

### Automatic Injections

> @Autowired: Automatically inject dependencies into needed repositories.

ExerciseRepository exerciseRepository

RoutineRepository routineRepository

UserRepository userRepository

AchievementsRepository achievementsRepository

### Methods

> public Exercise saveExercise(Exercise exercise): Saves an Exercise entity in the database.

Parameters:
exercise (Exercise): The Exercise entity to save.

Return:
The Exercise entity saved.

> public Routine saveRoutine(Routine routine): Saves a Routine entity in the database.

Parameters:routine (Routine): The Routine entity to save.

Return:The Routine entity saved.

> public User saveUser(User user): Saves a User entity in the database.

Parameters: user (User): The User entity to save.

Return:The saved User entity.

> public Achievement saveAchievement(Achievement achievement): Saves an Achievement entity in the database.

Parameters:
achievement (Achievement): The Achievement entity to save.

Return:
The Achievement entity saved.

## Class ManyToOneService

### Description

The ManyToOneService class provides services for managing entities with many-to-one relationships, such as Exercise, MuscleZone, Routine, and User.

### Annotations

> @Service: Mark this class as a Spring service.

### Automatic Injections

> @Autowired: Automatically inject dependencies into needed repositories.

ExerciseRepository exerciseRepository

MuscleZoneRepository muscleZoneRepository

UserRepository userRepository

RoutineRepository routineRepository

### Methods

> public Exercise saveExercise(Exercise exercise): Saves an Exercise entity in the database.

Parameters:
exercise (Exercise): The Exercise entity to save.

Return:
The Exercise entity saved.

> public Routine saveRoutine(Routine routine): Saves a Routine entity in the database.

Parameters:
routine (Routine): The Routine entity to save.

Return:
The Routine entity saved.

> public User saveUser(User user): Saves a User entity in the database.

Parameters:
user (User): The User entity to save.

Return:
The saved User entity.

> public MuscleZone saveMuscleZone(MuscleZone muscleZone): Saves a MuscleZone entity in the database.

Parameters:
muscleZone (MuscleZone): The MuscleZone entity to save.

Return:
The saved MuscleZone entity.

# Exceptions

### Package

com.olympus.exception

## Class ResourceNotFoundException

### Description

The ResourceNotFoundException class defines a custom exception that extends RuntimeException. This exception is used to indicate that a resource was not found.

### Annotations

> @ResponseStatus(HttpStatus.NOT_FOUND): Specifies that this exception should result in a response with the status 404 Not Found.

### Attributes

> private static final long serialVersionUID = -3510175088574375864L: Unique identifier for the serializable class.

### Builders

> public ResourceNotFoundException(): Default constructor.

Creates an instance of ResourceNotFoundException with no error message.

> public ResourceNotFoundException(String message): Constructor that receives an error message.

Parameters:
message (String): The error message.

> public ResourceNotFoundException(String message, Throwable cause): Constructor that receives an error message and a cause.

Parameters:
message (String): The error message.
cause (Throwable): The cause of the exception.

# Repositories

### Package

com.olympus.repositories

## AchievementsRepository Interface

### Description

AchievementsRepository is a repository that provides CRUD methods and queries specific to the Achievement entity.

### Annotations

@Repository: Indicates that this interface is a Spring repository component.

### Methods

> List<Achievement> findByUser_UserId(Long userId): Find Achievements by the user's ID.

Parameters:
userId (Long): The ID of the user whose achievements are to be found.

Return:
A list of achievements associated with the given user ID.

## AdminRepository Interface

### Description

AdminRepository is a repository that provides CRUD methods and queries specific to the Admin entity.

### Annotations

> @Repository: Indicates that this interface is a Spring repository component.

### Methods

> Admin findByAdminMail(String adminMail): Finds an admin (Admin) by your email.

Parameters:
adminMail (String): The administrator's email address.

Return:
The administrator corresponding to the given email.

## ExerciseRepository Interface

### Description

ExerciseRepository is a repository that provides CRUD methods and queries specific to the Exercise entity.

### Annotations

> @Repository: Indicates that this interface is a Spring repository component.

### Methods

> List<Exercise> findAllByMuscleZoneId(Long muscle_zone_id): Finds all exercises (Exercise) by the ID of the muscle zone.

Parameters:
muscle_zone_id (Long): The ID of the muscle area.

Return:
A list of exercises associated with the given muscle area.

> List<Exercise> findAllByRoutinesId(Long routineId): Finds all exercises (Exercise) by the routine ID.

Parameters:
routineId (Long): The ID of the routine.

Return:
A list of exercises associated with the given routine.

## MuscleZoneRepository Interface

### Description

MuscleZoneRepository is a repository that provides CRUD methods for the MuscleZone entity.

### Annotations

> @Repository: Indicates that this interface is a Spring repository component.

## RoutineRepository Interface

### Description

RoutineRepository is a repository that provides CRUD methods and queries specific to the Routine entity.

### Annotations

> @Repository: Indicates that this interface is a Spring repository component.

### Methods

> List<Routine> findByUserId(Long userId): Finds routines (Routine) by the user's ID.

Parameters:
userId (Long): The ID of the user whose routines are to be found.

Return:
A list of routines associated with the given user ID.

## UserRepository Interface

### Description

UserRepository is a repository that provides CRUD methods and queries specific to the User entity.

### Annotations

> @Repository: Indicates that this interface is a Spring repository component.

### Methods

> User findByUserMail(String userMail): Finds a user (User) by their email.

Parameters:
userMail (String): The user's email address.

Return:
The user corresponding to the given email.

> User findById(long id): Finds a user by its ID.

Parameters:
id (long): The user ID.

Return:
The user corresponding to the given ID.

# Controllers

### Package

com.olympus.controllers

## Class AchievementController

### Description

The AchievementController class manages achievements in the application.

### Annotations

> @RestController: Indicates that this class is a REST controller.

> @RequestMapping("/olympus/v1"): Base URL mapping for all request handlers in this class.
> ->@CrossOrigin(origins = "_", allowedHeaders = "_"): Allows cross-origin requests.

### Dependencies

> AchievementsRepository achievementsRepository: Injects an instance of AchievementsRepository.

> UserRepository userRepository: Injects an instance of UserRepository.

### Methods

> public List<Achievement> getAllAchievements()

Retrieves all achievements.

Return: List<Achievement>: A list of all achievements.

> public Optional<Achievement> getAchievementByAchievementId(Long achievementId) Retrieves a specific achievement by ID.

Parameters: achievementId (Long): The ID of the achievement to retrieve.

Return: Optional<Achievement>: The achievement with the specified ID, if found.

> public List<Achievement> getAchievementsByUser(Long userId) Retrieves all achievements of a specific user.

Parameters: userId (Long): The ID of the user whose achievements to retrieve.

Return: List<Achievement>: A list of achievements associated with the specified user.

> public Achievement addAchievementToUser(Long achievementId, Long userId) Adds an achievement to a user.

Parameters:
achievementId (Long): The ID of the achievement to add.

userId (Long): The ID of the user to whom the achievement will be added.

Return: Achievement: The added achievement.

> public void removeAchievementFromUser(Long achievementId, Long userId)

Removes an achievement from a user.

Parameters:
achievementId (Long): The ID of the achievement to remove.

userId (Long): The ID of the user from whom the achievement will be removed.

## Class AdminController

### Description

The AdminController class manages administrative operations in the application.

### Annotations

> @RestController: Indicates that this class is a REST controller.
> @RequestMapping("/olympus/v1"): Base URL mapping for all request handlers in this class.
> @CrossOrigin(origins = "", allowedHeaders = ""): Allows cross-origin requests.

### Dependencies

> AdminRepository adminRepository: Injects an instance of >AdminRepository.

### Methods

> public void deleteAdmin(Long adminId)
> Deletes an admin by ID.

Parameters:
adminId (Long): The ID of the admin to delete.

> public boolean verifyAdmin(LoginAdminInformation adminRequest)
> Verifies admin credentials.

Parameters:
adminRequest (LoginAdminInformation): The login information of the admin to verify.

Return:
boolean: true if the admin credentials are valid; otherwise, false.

> public Admin updateAdminById(Long adminId, Admin adminRequest)
> Updates an admin by ID.

Parameters:
adminId (Long): The ID of the admin to update.
adminRequest (Admin): The updated admin information.

Return:
Admin: The updated admin entity.

> public Admin createAdmin(Admin userRequest)
> Creates a new admin.

Parameters
userRequest (Admin): The admin information for creation.

Return
Admin: The created admin entity.

## Class ExerciseController

### Description

The ExerciseController class manages exercises in the application.

### Annotations

> @RestController: Indicates that this class is a REST controller.
> @RequestMapping("/olympus/v1"): Base URL mapping for all request handlers in this class.
> @CrossOrigin(origins = "_", allowedHeaders = "_"): Allows cross-origin requests.

### Dependencies

> ExerciseRepository exerciseRepository: Injects an instance of ExerciseRepository.

### Methods

> public List<Exercise> getAllExercises()
> Retrieves all exercises.

Return:
List<Exercise>: A list of all exercises.

> public Optional<Exercise> getExerciseById(Long exerciseId)
> Retrieves an exercise by ID.

Parameters:
exerciseId (Long): The ID of the exercise to retrieve.

Return
Optional<Exercise>: The exercise with the specified ID, if found.

> public List<Exercise> getExercisesByMuscleZoneId(Long muscleZoneId)
> Retrieves exercises by muscle zone ID.

Parameters:
muscleZoneId (Long): The ID of the muscle zone.

Return:
List<Exercise>: A list of exercises associated with the specified muscle zone.

> public List<Exercise> getExercisesByRoutineId(Long routineId)

Retrieves exercises from a routine by routine ID.

Parameters:
routineId (Long): The ID of the routine.

Return:
List<Exercise>: A list of exercises associated with the specified routine.

## Class MuscleZoneController

### Description

The MuscleZoneController class manages muscle zones in the application.

### Annotations

> @RestController: Indicates that this class is a REST controller.

> @RequestMapping("/olympus/v1"): Base URL mapping for all request handlers in this class.
> @CrossOrigin(origins = "_", allowedHeaders = "_"): Allows cross-origin requests.

### Dependencies

> MuscleZoneRepository muscleZoneRepository: Injects an instance of MuscleZoneRepository.

### Methods

> public List<MuscleZone> getAllMuscleZones() Retrieves all muscle zones.

Return:

List<MuscleZone>: A list of all muscle zones.

> public Optional<MuscleZone> getMuscleZonesByMuscleZoneId(Long muscleZoneId) Retrieves a muscle zone by ID.

Parameters

> `muscleZoneId` (Long): The ID of the muscle zone to retrieve.

Return

> Optional<MuscleZone>: The muscle zone with the specified ID, if found.

> Class RoutineController

### Description

The RoutineController class manages routines in the application.

### Annotations

> @RestController: Indicates that this class is a REST controller.
> @RequestMapping("/olympus/v1"): Base URL mapping for all request handlers in this class.
> @CrossOrigin(origins = "_", allowedHeaders = "_"): Allows cross-origin requests.

### Dependencies

> RoutineRepository routineRepository: Injects an instance of RoutineRepository.
> UserRepository userRepository: Injects an instance of UserRepository.
> ExerciseRepository exerciseRepository: Injects an instance of ExerciseRepository.

### Methods

> public List<Routine> getAllRoutines() Retrieves all routines.

Return: List<Routine>: A list of all routines.

> public List<Routine> getRoutineByUserId(Long userId) Retrieves routines by user ID.

Parameters: userId` (Long): The ID of the user whose routines to retrieve.

Return: List<Routine>: A list of routines associated with the specified user.

> public Optional<Routine> getRoutineByRoutineId(Long routineId)

Retrieves a routine by ID.

Parameters: routineId (Long): The ID of the routine to retrieve.

Return: Optional<Routine>: The routine with the specified ID, if found.

> public void deleteRoutine(Long routineId) Deletes a routine by ID.

Parameters: routineId (Long): The ID of the routine to delete.

> public Routine addRoutineToUser(Routine routineRequest, Long userId) Adds a routine to a user.

Parameters: routineRequest (Routine): The routine to add.

userId (Long): The ID of the user to whom the routine will be added.

Return

> Routine: The added routine.

> public Routine addExerciseToRoutine(Long exerciseId, Long routineId) Adds an exercise to a routine.

Parameters:

exerciseId (Long): The ID of the exercise to add.

routineId (Long): The ID of the routine to which the exercise will be added.

Return: Routine: The updated routine.

> public void removeExerciseFromRoutine(Long exerciseId, Long routineId) Removes an exercise from a routine.

Parameters

exerciseId (Long): The ID of the exercise to remove.

routineId (Long): The ID of the routine from which the exercise will be removed.

## Class UserController

### Description

The UserController class manages users in the application.

### Annotations

> @RestController: Indicates that this class is a REST controller.

> @RequestMapping("/olympus/v1"): Base URL mapping for all request handlers in this class.

> @CrossOrigin(origins = "_", allowedHeaders = "_"): Allows cross-origin requests.

### Dependencies

> UserRepository userRepository: Injects an instance of UserRepository.

### Methods

> public List<User> getAllUsers() Retrieves all users.

Return: List<User>: A list of all users.

> public LoginUserReturnObject verifyUser(LoginUserInformation userRequest)

Verifies user login credentials.

Parameters: userRequest (LoginUserInformation): The login information of the user to verify.

Return: LoginUserReturnObject: An object indicating whether the user credentials are valid.

> public User createUser(User userRequest) Creates a new user.

Parameters: userRequest (User): The user information for creation.

Return: User: The created user.

> public User updateUserById(Long userId, User userRequest)Updates user information by user ID.

Parameters:

userId(Long): The ID of the user to update.

userRequest (User): The updated user information.

Return: User The updated user entity.

> public void deleteUser(Long userId)

Deletes a user by user ID.

Parameters: userId (Long): The ID of the user to delete.

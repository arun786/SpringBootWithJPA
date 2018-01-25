# Steps for Persisting Data.

## Step 1 : Create an Entity Class

An Entity is an ordinary class whose instance can be stored in the database.

Requirements of Entity are as below.

1. It should be a top level class.
2. should have a no arg constructor which can be public or protected.
3. cannot have final methods, class or variables.

Example.

    @Entity(name = "Person")
    public class Person {
        @Column(name = "id")
        @Id
        @GeneratedValue
        private String id;
    
        @Column(name = "name")
        private String name;
        @Column(name = "location")
        private String location;
        @Column(name = "birth_date")
        private Date birth_date;
    
        public Person() {
        }

## Step 2. Annotate the DAO Layer.

    step 1: Annotate the DAO class with the below.

        1. @Repository - This is eligible for Spring DataAccessException translation.
        2. @Transactional - This defines the scope of single database transaction and database
        transaction happens inside the scope of a persistence context.
        
    step 2: 
        1. Define an EntityManager and annotate it with @PersistenceContext
    
    EntityManager is the persistence context which internally uses Hibernate Session.
    
    
    Example 
    
        import com.arun.demo.bean.Person;
        import org.springframework.stereotype.Repository;
        
        import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;
        import javax.transaction.Transactional;
        
        @Repository
        @Transactional
        public class PersonJpaDao {
        
            /**
             * To connect to the database, we require an Entity Manager
             */
            @PersistenceContext
            EntityManager entityManager;
        
            public Person findById(String id) {
                return entityManager.find(Person.class, id);
            }
        
        }

    
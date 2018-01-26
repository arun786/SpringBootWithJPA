# To find a Person based on Id

## Flow from Controller to Service to Database is as follows

    Controller -> Service -> DAO -> DB
    
## Controller

    @Autowired
    private PersonJpaService personJpaService;

    @GetMapping(value = "/jpa/find/{id}")
    public Person findById(@PathVariable final String id) {
        return personJpaService.findById(id);
    }

## Service 

    @Autowired
    private PersonJpaDao personJpaDao;
    
    public Person findById(String id) {
        return personJpaDao.findById(id);
    }
   
## Dao Layer. 
    
   Here we call the entityManager.find(Person.class, Id). 

    @Repository
    @Transactional
    public class PersonJpaDao {
    
        /**
         * To connect to the database, we require an Entity Manager
         */
        @PersistenceContext
        EntityManager entityManager;
    
        /**
         *
         * @param id
         * @return
         * To get Data based on an Id.
         */
        public Person findById(String id) {
            return entityManager.find(Person.class, id);
        }
    }

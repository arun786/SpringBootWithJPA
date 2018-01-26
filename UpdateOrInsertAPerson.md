# Update Or Insert an Object Person Entity.

## Update

For Update or Insert, we use entityManager.merge(person)

    
## Flow from Controller to Service to Database is as follows

    Controller -> Service -> DAO -> DB
    
## Controller

        @PutMapping(value = "/jpa/update")
        public Person updatePerson(@RequestBody Person person) {
            return personJpaService.updatePerson(person);
        }
        
## Service 

        public Person updatePerson(Person person) {
            return personJpaDao.updatePerson(person);
        }
     
## Dao 

        /**
         * @param person
         * @return To update a Person, we need to send the Person details with existing ID
         */
        public Person updatePerson(Person person) {
            return entityManager.merge(person);
        }
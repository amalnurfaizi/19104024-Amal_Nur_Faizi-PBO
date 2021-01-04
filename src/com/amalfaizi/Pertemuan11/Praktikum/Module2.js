var person = (function(){
    var age = 25
  
    function setAge(newAge){
      age = newAge
    }
  
    function getAge(){
      return age
    }
  
    function growOLder(){
      age++
    }
  
    return{
      name : 'Zeus',
      setAge : setAge,
      getAge : getAge,
      growOLder : growOLder
    }
    
  }())
  
  console.log('Nama person\t: ', person.name)
  console.log('Umur person\t: ', person.getAge())
  
  //mengganti umur
  person.setAge(100)
  console.log('Umur person yang diganti\t: ', person.getAge())
  
  person.growOLder()
  console.log('Umur person yang ditambah\t: ', person.getAge())
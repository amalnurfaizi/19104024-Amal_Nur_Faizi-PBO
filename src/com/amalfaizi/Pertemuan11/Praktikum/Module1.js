var person = (function(){
  var age = 25

  return {
    name : 'Zeus',

    getAge : function(){
      return age

    },
    growOLder : function(){
      age++

    }
  }
}())

console.log("Nama person\t: ",person.name);
console.log("Umur person\t: ", person.getAge());

person.age = 100 
console.log("Umur person yang diganti\t: ", person.getAge());

person.growOLder()
console.log("Umur person yang ditambah\t: ",person.getAge());
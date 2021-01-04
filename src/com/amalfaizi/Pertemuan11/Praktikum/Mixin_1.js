function mixin(receiver, supplier){
  for(var property in supplier){
    if(supplier.hasOwnProperty(property)){
      receiver[property] = supplier[property]
    }
  }
  return receiver 
}

var person = (function(){

  var name = 'Zeus'
  var age = 25

  function setName(newName){
    name = newName
  }

  function getName(){
    return name
  }

  function getAge(){
    return age
  }

  return {setName : setName, getName : getName, getAge : getAge }
}())

var Title = (function(){
  var element = 'Earth'

  function InnerTitle(title){
    this.title = title
    this.element = element
  }

  return InnerTitle
}())

person.setName('Zeus')
var title = new Title('Imortal')

mixin(person, title)//Penggabungan

console.log('Nama\t: ',person.getName());
console.log('Age\t\t: ',person.getAge());
console.log('Title\t: ',person.title);
console.log('Element\t: ',person.element);
function mixin(receiver,supplier){
    for(var property in supplier){
      if(!receiver.hasOwnProperty(property)){
        receiver[property] = supplier[property]
      }
    }
    return receiver
  }
  
  var person = (function(){
    var name = ' Poseidon'
    var age = 25
    var element = 'Water'
  
    function setName(newName){
      name = newName
    } 
  
    function getName(){
      return name
    }
  
  
    function getAge(){
      return age
    }
  
    return{setName : setName, getName: getName, getAge: getAge, element : element}
  }())
  
  var Title = (function(){
    var element = 'Anemo'
  
    function InnerTitle(title){
      this.title = title
      this.element = element
    }
    return InnerTitle
  }())
  
  person.setName('Zeus')
  var title = new Title('Immortal')
  
  mixin(person,title)//penggabungan
  
  console.log('Name\t: ', person.getName());
  console.log('Age\t\t: ', person.getAge());
  console.log('Title\t: ', person.title);
  console.log('Element\t: ', person.element);
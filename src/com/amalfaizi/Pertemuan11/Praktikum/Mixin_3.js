function mixin(receiver, suplier){

   if(arguments.length > 2){
        for(var i = 2, len = arguments.length; i < len; i++){
            if(!receiver.hasOwnProperty(arguments[i])){
                receiver[arguments[i]] = suplier[arguments[i]]
            }
        }
   }else{
        for(var property in suplier){
            if(suplier.hasOwnProperty(property)){
              receiver[property] = suplier[property]
        }
     }
   }
    

    return receiver
}

var person = (function(){

    var name = 'Poseidon'
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

    return { setName : setName, getName : getName, getAge : getAge }
}())

var Title = (function(){
    var element = 'Water'

    function InnerTitle(title){
        this.title = title
        this.element = element
    }
    return InnerTitle
}())

person.setName('Zeus')
var title = new Title('Immortal')

mixin(person, title, "title") //Penggabungan

console.log('Name\t: ', person.getName())
console.log('Age\t\t: ', person.getAge())
console.log('Title\t: ', person.title)
console.log('Element\t: ', person.element)
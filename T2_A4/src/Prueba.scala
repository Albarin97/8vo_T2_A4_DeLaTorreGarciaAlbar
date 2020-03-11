
class paciente(var nombre:String,
    var primerApe:String,
    var segundoApe:String,
    var edad:Byte,
    var fecha:Array[String],
    var hora:Array[String],
    var bienestar:Array[Int],
    var temp:Array[Double],
    var humedad:Array[Int]){
  
  def promBienestar() : Double = {
    var suma=0.0
    for(x<-0 to bienestar.length-1){
      suma=suma+x
    }
    suma = suma/bienestar.length
    suma
  }
  
  def temMayor() : String = {
    var pos = 0
    var tem = temp(0)
    for(x<-0 to temp.length-1){
      if(temp(x)>tem){
        tem=temp(x)
        pos = x
      }
    }
    var res = "Temperatura mayor: "+tem+" Nivel de Bienestar: "+bienestar(pos)+" Fecha: "+fecha(pos)+" Hora: "+hora(pos)+" Humedad: "+humedad(pos)+""
    res
  }
  
  def temMenor() : String = {
    var pos = 0
    var tem = temp(0)
    for(x<-0 to temp.length-1){
      if(temp(x)<tem){
        tem=temp(x)
        pos = x
      }
    }
    var res = "Temperatura Menor: "+tem+" Nivel de Bienestar: "+bienestar(pos)+" Fecha: "+fecha(pos)+" Hora: "+hora(pos)+" Humedad: "+humedad(pos)+""
    res
  }
  override def toString : String="Nombre: "+nombre+" Ape: "+primerApe+" 2Ape: "+segundoApe+" Edad: "+edad 
  
}//class

object Prueba {
  def main(args: Array[String]): Unit = {
    var fecha=Array("10/2","11/2","12/2","13/2")
    var hora=Array("13:45","14:30","13:00","13:20")
    var bienestar=Array(5, 5, 4, 5)
    var temp=Array(35.0, 36.5, 36.0, 40.0)
    var hume=Array(70, 75, 50, 80)
    
    var fecha1=Array("10/3","11/3","12/3","13/3")
    var hora1=Array("15:45","15:30","15:00","15:20")
    var bienestar1=Array(4, 3, 4, 1)
    var temp1=Array(38.0, 38.5, 30.0, 30.0)
    var hume1=Array(80, 85, 60, 50)
    
    var fecha2=Array("10/1","11/1","12/1","13/1")
    var hora2=Array("12:45","12:30","12:00","12:20")
    var bienestar2=Array(1, 2, 1, 4)
    var temp2=Array(30.0, 30.5, 35.0, 36.0)
    var hume2=Array(80, 95, 40, 70)
    
    var pas1= new paciente("Albar", "Torre", "Garcia", 22, fecha, hora, bienestar, temp, hume);
    var pas2= new paciente("Ivan", "Gamboa", "Ultreras", 21, fecha1, hora1, bienestar1, temp1, hume1);
    var pas3= new paciente("Daniel", "Rosa", "Castañeda", 21, fecha2, hora2, bienestar2, temp2, hume2);
    
    println(pas1.toString())
    println("Promedio Bienestar"+pas1.promBienestar())
    println("Temperatura Mayor"+pas1.temMayor())
    println("Temperatura Menor"+pas1.temMenor())
    println("============================")
    println(pas2.toString())
    println("Promedio Bienestar"+pas2.promBienestar())
    println("Temperatura Mayor"+pas2.temMayor())
    println("Temperatura Menor"+pas2.temMenor())
    println("============================")
    println(pas3.toString())
    println("Promedio Bienestar"+pas3.promBienestar())
    println("Temperatura Mayor"+pas3.temMayor())
    println("Temperatura Menor"+pas3.temMenor())
    
    
    
  }
  
  
  
}
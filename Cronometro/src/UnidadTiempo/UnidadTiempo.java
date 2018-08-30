package UnidadTiempo;
public class UnidadTiempo {
  
    private int i;
    private int horas;
    private int minutos;
    private int segundos;
    private int milisegundos;
    
  
    public void Go(int x)
    {
       while(i <= x )
       {
           milisegundos++;
           
           if(milisegundos >= 99)
           {
               milisegundos = 0;
               segundos++;
               
           }
           if(segundos > 59)
           {
              segundos = 0;
               minutos++;
               
           }
           if(minutos > 59)
           {
              minutos = 0;
               horas++;
               
           }
           
          i++;
             System.out.println(horas + " : " + minutos + " : " + segundos + " : " + milisegundos); 
           }
           while (i >= x)
           {
               milisegundos--;
               if(milisegundos <= 0)
               {
                   
                   segundos--;
                   milisegundos = 99;
               }
               if(segundos <= 0)
               {
                   minutos--;
                   segundos = 59;
               }
               if(horas < 0 || minutos < 0 || segundos < 0 )
               {
                   break;
               }
               
           System.out.println(horas + " : " + minutos + " : " + segundos + " : " + milisegundos);
        }
    }
}

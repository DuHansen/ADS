package exercicios02;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

public class ex12 {

    public static void main(String[] args) throws ParseException {
       Scanner entrada = new Scanner(System.in);
         Date data = new Date();

         System.out.println("Qual seu nome: ");
         String nome = entrada.nextLine();

         System.out.println("Qual sua data de nascimento: ");
         String datadenascimento = entrada.next();
         SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
         Date format = f.parse(datadenascimento);


         System.out.println("Qual a data de ingresso na empresa: ");
         int anodeingresso = entrada.nextInt();
         SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
         Date formatt = ff.parse(datadenascimento);

         int datax = format.getYear() - 1900 - data.getYear();

        System.out.println("A data de trabalho:" + datax);

         
         entrada.close();  
        } 
           
}
/*
System.out.println("Mes: " + localDate.getMonthValue());
System.out.println("Mes: " + localDate.getMonth().name());
System.out.println("Ano: " + localDate.getYear());
TER NO MÍNIMO 65ANOS DE IDADE.
TER TRABALHADO NO MÍNIMO 30ANOS.
TER NO MÍNIMO 60ANOS E TER TRABALHADO NO MÍNIMO 25ANOS.
COM  BASE  NAS  INFORMAÇÕES ACIMA,DESENVOLVA  UM  PROGRAMAQUE  LEIA O NOMEDO  EMPREGADO,
O ANODE  SEU  NASCIMENTO  E O ANO  DE  SEU  INGRESSO  NA  EMPRESA.
OPROGRAMA  DEVERÁ INFORMAR  O  NOME,A IDADE,
O  TEMPODE SERVIÇODO  EMPREGADO  E  A  MENSAGEM “REQUERER  APOSENTADORIA”OU “NÃO REQUERERAPOSENTADORIA”.
*/

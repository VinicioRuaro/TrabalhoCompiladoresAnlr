grammar Trabalho;

@header{ 
package teste.parser;
import java.util.*;
import compiladores.Simbolo;
}

@members{
    private HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();

}

prog  returns [Integer val]     :
       (stmt)+                
      ;

stmt  returns [Integer val]     :    
        input  EOL                                      
      | output EOL       
      ;

input returns [Integer val]     :
        'int'  VAR                #inputintvar
      | 'int'  VAR  '=' expr0    #inputintvarexpr
      | 'double'   VAR               #inputdoublevar
      | 'double'  VAR  '=' expr0  #inputdoublevarexpr 
      | 'string'  VAR  '=' '"' PALA '"'      #inputstringvarecpr
      | 'string'   VAR           #inputstringvar
      | expr0                    #inputexpr 

      ;

output returns [String val]     : 
       'print' VAR                          
      ;

expr0 returns [Integer val]     : 
        expr1  '+'  h1=expr0       #eprxsoma
      | expr1  '-'  h2=expr0      #eprxmenos
      | expr1                                #eprx
      ;

expr1 returns [Integer val]     :
        expr2   '*'  t1=expr1    #eprxdmulti
       |expr2   '/'  t2=expr1    #eprxdividir
       |expr2   '%'  t3=expr1    #eprxresto
       |expr2                    #expr1expr2
       ;
 
expr2 returns [Integer val]     : 
       PE  expr0  PD                          #exprparentes
       | NUM                    #exprnum   
       | VAR                    #exprvar
       ;

EOL     : ';';
PE      : '(';
PD      : ')';
ADIC    : '+' ;
RESTO   : '%' ;
MENOS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
IGUAL   : '=' ;
PALA    : [a-zA-Z0-9_]+;
VAR     : [a-zA-Z][a-zA-Z0-9_]*;
NUM     : [-]?[0-9]*[.]?[,]?[0-9]+;
WS      : [\n\r \t]+ -> skip;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;
import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import teste.parser.TrabalhoListener;
import teste.parser.TrabalhoParser;
/**
 *
 * @author vinic
 */
public class Listener implements TrabalhoListener{

    HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();
    
    @Override
    public void enterProg(TrabalhoParser.ProgContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitProg(TrabalhoParser.ProgContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enterStmt(TrabalhoParser.StmtContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitStmt(TrabalhoParser.StmtContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enterInputintvar(TrabalhoParser.InputintvarContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputintvar(TrabalhoParser.InputintvarContext ctx) {
    Simbolo simbolo = new Simbolo("int",2);
    simbolo.valori=0;
    memory.put(ctx.VAR.getText(),simbolo);
    System.out.println(ctx.VAR.getText()+"="+0);              
                                   }

    @Override
    public void enterInputintvarexpr(TrabalhoParser.InputintvarexprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputintvarexpr(TrabalhoParser.InputintvarexprContext ctx) {
    Simbolo simbolo = new Simbolo("int",2);
    simbolo.valori=ctx.expr0.val;
    memory.put(ctx.VAR.getText(),simbolo);
    System.out.println(ctx.VAR.getText()+"="+ctx.expr0.val);              
                                   }

    @Override
    public void enterInputdoublevar(TrabalhoParser.InputdoublevarContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputdoublevar(TrabalhoParser.InputdoublevarContext ctx) {
    Simbolo simbolo = new Simbolo("double",1);
    simbolo.valord=0;
    memory.put(ctx.VAR.getText(),simbolo);
    System.out.println(ctx.VAR.getText()+"="+0);              
                                   }

    @Override
    public void enterInputdoublevarexpr(TrabalhoParser.InputdoublevarexprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputdoublevarexpr(TrabalhoParser.InputdoublevarexprContext ctx) {
     Simbolo simbolo = new Simbolo("double",1);
    simbolo.valord=ctx.expr0.val;
    memory.put(ctx.getText(),simbolo);
    System.out.println(ctx.VAR.getText()+"="+ctx.expr0.val);              
                                   }

    @Override
    public void enterInputstringvarecpr(TrabalhoParser.InputstringvarecprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputstringvarecpr(TrabalhoParser.InputstringvarecprContext ctx) {
    Simbolo simbolo = new Simbolo("String",0);
    simbolo.valors=ctx.PALA.getText();
    memory.put(ctx.VAR.getText(),simbolo);
    System.out.println(ctx.VAR.getText()+"="+ctx.PALA.getText());              
                                    }

    @Override
    public void enterInputstringvar(TrabalhoParser.InputstringvarContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputstringvar(TrabalhoParser.InputstringvarContext ctx) {
    Simbolo simbolo = new Simbolo("String",0);
    simbolo.valors="";
    memory.put(ctx.VAR.getText(),simbolo);
    System.out.println(ctx.VAR.getText()+"="+"");              
                                  }

    @Override
    public void enterInputexpr(TrabalhoParser.InputexprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitInputexpr(TrabalhoParser.InputexprContext ctx) {
    System.out.println(ctx.expr0.val);
    }

    @Override
    public void enterOutput(TrabalhoParser.OutputContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitOutput(TrabalhoParser.OutputContext ctx) {
    Simbolo a;
        a= memory.get(ctx.VAR.getText());
        
        if(a.tiponum==0){
            System.out.println(memory.get(ctx.VAR.getText()).tipo+"="+memory.get(ctx.VAR.getText()).valors);
        }
        if(a.tiponum==1){
            System.out.println(memory.get(ctx.VAR.getText()).tipo+"="+memory.get(ctx.VAR.getText()).valord);
        }
        if(a.tiponum==2){
            System.out.println(memory.get(ctx.VAR.getText()).tipo+"="+memory.get(ctx.VAR.getText()).valori);
        }
        System.out.println(memory.get(ctx.VAR.getText()));
        }

    @Override
    public void enterEprxsoma(TrabalhoParser.EprxsomaContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEprxsoma(TrabalhoParser.EprxsomaContext ctx) {
    ctx.val=ctx.expr1.val+ctx.h1.val;}

    @Override
    public void enterEprxmenos(TrabalhoParser.EprxmenosContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEprxmenos(TrabalhoParser.EprxmenosContext ctx) {
    ctx.val=ctx.expr1.val-ctx.h2.val;}

    @Override
    public void enterEprx(TrabalhoParser.EprxContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEprx(TrabalhoParser.EprxContext ctx) {
    ctx.val=ctx.expr1.val;}

    @Override
    public void enterEprxdmulti(TrabalhoParser.EprxdmultiContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEprxdmulti(TrabalhoParser.EprxdmultiContext ctx) {
    ctx.val=ctx.expr2.val*ctx.t1.val; }

    @Override
    public void enterEprxdividir(TrabalhoParser.EprxdividirContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEprxdividir(TrabalhoParser.EprxdividirContext ctx) {
    ctx.val=ctx.expr2.val/ctx.t2.val;}

    @Override
    public void enterEprxresto(TrabalhoParser.EprxrestoContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEprxresto(TrabalhoParser.EprxrestoContext ctx) {
    ctx.val=ctx.expr2.val%ctx.t3.val;}

    @Override
    public void enterExpr1expr2(TrabalhoParser.Expr1expr2Context ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitExpr1expr2(TrabalhoParser.Expr1expr2Context ctx) {
        ctx.val=ctx.expr2.val;}

    @Override
    public void enterExprparentes(TrabalhoParser.ExprparentesContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitExprparentes(TrabalhoParser.ExprparentesContext ctx) {
       ctx.val=ctx.expr0.val;  }

    @Override
    public void enterExprnum(TrabalhoParser.ExprnumContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitExprnum(TrabalhoParser.ExprnumContext ctx) {
     ctx.val=Integer.parseInt(ctx.NUM.getText()}

    @Override
    public void enterExprvar(TrabalhoParser.ExprvarContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitExprvar(TrabalhoParser.ExprvarContext ctx) {
    Simbolo a;
        a= memory.get(ctx.VAR.getText());
        
        if(a.tiponum==0){
            ctx.val=0;
            System.out.println("Atribuir uma string numa conta. Foi considerado como 0.");        }
        if(a.tiponum==1){
            ctx.val=a.valord;
        }
        if(a.tiponum==2){
            ctx.val=a.valori;
        }

        }

    @Override
    public void visitTerminal(TerminalNode tn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

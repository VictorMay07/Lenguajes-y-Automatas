
package analizadorlexico;

import analizadorlexico.Token.Tipos;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InterfazExpresion extends javax.swing.JFrame {
        int num = 0;
        int ope = 0;
        int var = 0;
        int cons = 0;
        int desc = 0;

    public InterfazExpresion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAnalizar = new javax.swing.JButton();
        jTexExpresion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTexResumen = new javax.swing.JTextField();
        jTexResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Lexico");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Lexico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jButtonAnalizar.setText("Analizar");
        jButtonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizarActionPerformed(evt);
            }
        });

        jTexExpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexExpresionActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Expresion Matematica:");

        jTexResumen.setEditable(false);
        jTexResumen.setBackground(new java.awt.Color(153, 255, 255));
        jTexResumen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTexResumen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTexResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexResumenActionPerformed(evt);
            }
        });

        jTexResultado.setEditable(false);
        jTexResultado.setBackground(new java.awt.Color(153, 255, 255));
        jTexResultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTexResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexResultadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultado:");

        jLabel3.setText("Resumen:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTexExpresion, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnalizar)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTexResumen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTexResultado)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTexResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTexResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexResultadoActionPerformed
     
    }//GEN-LAST:event_jTexResultadoActionPerformed

    private void jTexExpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexExpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexExpresionActionPerformed

    private void jButtonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizarActionPerformed
        String entrada = this.jTexExpresion.getText();
        ArrayList<Token> tokens =lex(entrada);
        String result = "";
        for (Token token : tokens) {
            result = result + token.getTipo() + " : " + token.getValor() + "\n";
        }//cierre del for
        this.jTexResultado.setText(result);
        String encontrados = ("Total de Numeros: " + num
                + "\nTotal de Operadores: " + ope
                + "\nTotal de Variables " + var
                + "\nTotal de Constantes: " + cons
                + "\nDesconocidos totales: " + desc);
        this.jTexResumen.setText(encontrados);

    }//GEN-LAST:event_jButtonAnalizarActionPerformed

    private void jTexResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexResumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexResumenActionPerformed

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                 InterfazExpresion ventana = new InterfazExpresion();
                 ventana.setLocationRelativeTo(null);
            
            ventana.setVisible(true);
            }
        });
    }
     private  ArrayList<Token> lex(String entrada) {
        final ArrayList<Token> tokens = new ArrayList();
        final StringTokenizer st = new StringTokenizer(entrada);
        //variables para contadores
        
        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            boolean bandera = false;

            for (Tipos tokenTipo : Tipos.values()) {
                Pattern patron = Pattern.compile(tokenTipo.patron);
                Matcher busqueda = patron.matcher(palabra);

                if (busqueda.find()) {
                    Token token = new Token();
                    token.setTipo(tokenTipo);
                    token.setValor(palabra);
                    //contador de los valores    
                    if (String.valueOf(token.getTipo()).equals("Numero")) {
                        num += 1;
                    } else if (String.valueOf(token.getTipo()).equals("Operador")) {
                        ope += 1;
                    } else if (String.valueOf(token.getTipo()).equals("Variable")) {
                        var += 1;
                    } else if (String.valueOf(token.getTipo()).equals("Constante")) {
                        cons += 1;
                    } else if (String.valueOf(token.getTipo()).equals("Desconocidos")) {
                        desc += 1;
                    }//cierre del else if de contadores

                    tokens.add(token);
                    bandera = true;
                    break; 
                }//cierre del if
            }//cierre del for

        }//cierre de while
        
       
        
        return tokens;
    }//cierre de Array


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTexExpresion;
    private javax.swing.JTextField jTexResultado;
    private javax.swing.JTextField jTexResumen;
    // End of variables declaration//GEN-END:variables
}

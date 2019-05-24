/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ktsuke
 */
public class Historico extends ChartFactory{
    
    public CategoryDataset dados(ProdHasLoja p){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        
        dataSet.addValue(p.getVlr_prod(), p.getNom_prod(), p.getCotacao());
        
        
        return dataSet;
    }
    
    public JFreeChart graficoLinha(CategoryDataset dataSet){
     
        JFreeChart grafico = ChartFactory.createLineChart3D("Histórico Anual","Mês","Preço", dataSet,
                                                             PlotOrientation.VERTICAL, true, false, false);
        
        return grafico;
      
    }
    
    public ChartPanel criaGrafico(ProdHasLoja p){
        CategoryDataset dataSet = this.dados(p);
        JFreeChart grafico = this.graficoLinha(dataSet);
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        return painelGrafico;
    }
    
}


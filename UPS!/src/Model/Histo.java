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
public class Histo extends ChartFactory{
    
    public CategoryDataset dados(Produto p){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        
        dataSet.addValue(p.getV_cash(), p.getNome(), p.getData());
        
        
        return dataSet;
    }
    
    public JFreeChart graficoLinha(CategoryDataset dataSet){
     
        JFreeChart grafico = ChartFactory.createLineChart3D("Histórico Anual","Mês","Preço", dataSet,
                                                          PlotOrientation.VERTICAL, true, false, false);
        
        return grafico;
      
    }
    
    public ChartPanel criaGrafico(Produto p){
        CategoryDataset dataSet = this.dados(p);
        JFreeChart grafico = this.graficoLinha(dataSet);
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        return painelGrafico;
    }
    
}


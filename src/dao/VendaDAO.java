/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author vivic
 */
public class VendaDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction(); //começa transação
        session.save(object); //salva transação
        session.getTransaction().commit();;  //comita a transação   
    }

    @Override
    public void update(Object object) {
       session.beginTransaction(); //começa transação
       session.flush();
       session.clear();
       session.update(object); //salva transação
       session.getTransaction().commit();;  //comita a transação
    }

    @Override
    public void delete(Object object) {
      session.beginTransaction(); //começa transação
      session.flush();
      session.clear();
      session.delete(object); //salva transação
      session.getTransaction().commit();;  //comita a transação
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

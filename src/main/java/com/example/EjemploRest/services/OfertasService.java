package com.example.EjemploRest.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EjemploRest.entities.Oferta;
import com.example.EjemploRest.persistence.OfertaDAO;
@Service
public class OfertasService {
    @Autowired
    private OfertaDAO ofertaDao;
    public Oferta getOferta(int id) {
        return ofertaDao.findById(id).get();
    }
    public List<Oferta> getOfertas() {
        return ofertaDao.findAll();
    }
    public Oferta insertOferta(Oferta oferta) {
        return ofertaDao.save(oferta);
    }
    public Oferta updateOferta(Oferta oferta) {
        return ofertaDao.save(oferta);
    }
    public void deleteOferta(int id) {
        ofertaDao.deleteById(id);
    }
}
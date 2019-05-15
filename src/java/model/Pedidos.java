/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author will
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p")
    , @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id")
    , @NamedQuery(name = "Pedidos.findByCardapio", query = "SELECT p FROM Pedidos p WHERE p.cardapio = :cardapio")
    , @NamedQuery(name = "Pedidos.findByUsuario", query = "SELECT p FROM Pedidos p WHERE p.usuario = :usuario")
    , @NamedQuery(name = "Pedidos.findByMesa", query = "SELECT p FROM Pedidos p WHERE p.mesa = :mesa")
    , @NamedQuery(name = "Pedidos.findByCliente", query = "SELECT p FROM Pedidos p WHERE p.cliente = :cliente")
    , @NamedQuery(name = "Pedidos.findByFuncionario", query = "SELECT p FROM Pedidos p WHERE p.funcionario = :funcionario")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "cardapio")
    private String cardapio;
    @Size(max = 100)
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "mesa")
    private Integer mesa;
    @Size(max = 100)
    @Column(name = "cliente")
    private String cliente;
    @Size(max = 100)
    @Column(name = "funcionario")
    private String funcionario;

    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pedidos[ id=" + id + " ]";
    }
    
}

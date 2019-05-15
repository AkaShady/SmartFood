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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author will
 */
@Entity
@Table(name = "filiais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filiais.findAll", query = "SELECT f FROM Filiais f")
    , @NamedQuery(name = "Filiais.findById", query = "SELECT f FROM Filiais f WHERE f.id = :id")
    , @NamedQuery(name = "Filiais.findByNome", query = "SELECT f FROM Filiais f WHERE f.nome = :nome")
    , @NamedQuery(name = "Filiais.findByEndereco", query = "SELECT f FROM Filiais f WHERE f.endereco = :endereco")
    , @NamedQuery(name = "Filiais.findByEmpresa", query = "SELECT f FROM Filiais f WHERE f.empresa = :empresa")})
public class Filiais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 100)
    @Column(name = "empresa")
    private String empresa;

    public Filiais() {
    }

    public Filiais(Integer id) {
        this.id = id;
    }

    public Filiais(Integer id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
        if (!(object instanceof Filiais)) {
            return false;
        }
        Filiais other = (Filiais) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Filiais[ id=" + id + " ]";
    }
    
}

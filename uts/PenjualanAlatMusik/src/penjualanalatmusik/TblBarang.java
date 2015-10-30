/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanalatmusik;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Winky
 */
@Entity
@Table(name = "tbl_barang", catalog = "penjualan_alatmusik", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblBarang.findAll", query = "SELECT t FROM TblBarang t"),
    @NamedQuery(name = "TblBarang.findByIdbrg", query = "SELECT t FROM TblBarang t WHERE t.idbrg = :idbrg"),
    @NamedQuery(name = "TblBarang.findByNamabrg", query = "SELECT t FROM TblBarang t WHERE t.namabrg = :namabrg"),
    @NamedQuery(name = "TblBarang.findByStokbrg", query = "SELECT t FROM TblBarang t WHERE t.stokbrg = :stokbrg"),
    @NamedQuery(name = "TblBarang.findByHargabrg", query = "SELECT t FROM TblBarang t WHERE t.hargabrg = :hargabrg")})
public class TblBarang implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_brg")
    private Integer idbrg;
    @Basic(optional = false)
    @Column(name = "Nama_brg")
    private String namabrg;
    @Basic(optional = false)
    @Column(name = "Stok_brg")
    private int stokbrg;
    @Basic(optional = false)
    @Column(name = "Harga_brg")
    private int hargabrg;

    public TblBarang() {
    }

    public TblBarang(Integer idbrg) {
        this.idbrg = idbrg;
    }

    public TblBarang(Integer idbrg, String namabrg, int stokbrg, int hargabrg) {
        this.idbrg = idbrg;
        this.namabrg = namabrg;
        this.stokbrg = stokbrg;
        this.hargabrg = hargabrg;
    }

    public Integer getIdbrg() {
        return idbrg;
    }

    public void setIdbrg(Integer idbrg) {
        Integer oldIdbrg = this.idbrg;
        this.idbrg = idbrg;
        changeSupport.firePropertyChange("idbrg", oldIdbrg, idbrg);
    }

    public String getNamabrg() {
        return namabrg;
    }

    public void setNamabrg(String namabrg) {
        String oldNamabrg = this.namabrg;
        this.namabrg = namabrg;
        changeSupport.firePropertyChange("namabrg", oldNamabrg, namabrg);
    }

    public int getStokbrg() {
        return stokbrg;
    }

    public void setStokbrg(int stokbrg) {
        int oldStokbrg = this.stokbrg;
        this.stokbrg = stokbrg;
        changeSupport.firePropertyChange("stokbrg", oldStokbrg, stokbrg);
    }

    public int getHargabrg() {
        return hargabrg;
    }

    public void setHargabrg(int hargabrg) {
        int oldHargabrg = this.hargabrg;
        this.hargabrg = hargabrg;
        changeSupport.firePropertyChange("hargabrg", oldHargabrg, hargabrg);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbrg != null ? idbrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblBarang)) {
            return false;
        }
        TblBarang other = (TblBarang) object;
        if ((this.idbrg == null && other.idbrg != null) || (this.idbrg != null && !this.idbrg.equals(other.idbrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "penjualanalatmusik.TblBarang[ idbrg=" + idbrg + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanalatmusik;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Winky
 */
@Entity
@Table(name = "tbl_pelanggan", catalog = "penjualan_alatmusik", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblPelanggan.findAll", query = "SELECT t FROM TblPelanggan t"),
    @NamedQuery(name = "TblPelanggan.findByIdpelanggan", query = "SELECT t FROM TblPelanggan t WHERE t.idpelanggan = :idpelanggan"),
    @NamedQuery(name = "TblPelanggan.findByNama", query = "SELECT t FROM TblPelanggan t WHERE t.nama = :nama"),
    @NamedQuery(name = "TblPelanggan.findByAlamat", query = "SELECT t FROM TblPelanggan t WHERE t.alamat = :alamat"),
    @NamedQuery(name = "TblPelanggan.findByTelefon", query = "SELECT t FROM TblPelanggan t WHERE t.telefon = :telefon"),
    @NamedQuery(name = "TblPelanggan.findByTgllahir", query = "SELECT t FROM TblPelanggan t WHERE t.tgllahir = :tgllahir")})
public class TblPelanggan implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_pelanggan")
    private Integer idpelanggan;
    @Basic(optional = false)
    @Column(name = "Nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "Alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "Telefon")
    private String telefon;
    @Basic(optional = false)
    @Column(name = "Tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tgllahir;

    public TblPelanggan() {
    }

    public TblPelanggan(Integer idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public TblPelanggan(Integer idpelanggan, String nama, String alamat, String telefon, Date tgllahir) {
        this.idpelanggan = idpelanggan;
        this.nama = nama;
        this.alamat = alamat;
        this.telefon = telefon;
        this.tgllahir = tgllahir;
    }

    public Integer getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(Integer idpelanggan) {
        Integer oldIdpelanggan = this.idpelanggan;
        this.idpelanggan = idpelanggan;
        changeSupport.firePropertyChange("idpelanggan", oldIdpelanggan, idpelanggan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        String oldTelefon = this.telefon;
        this.telefon = telefon;
        changeSupport.firePropertyChange("telefon", oldTelefon, telefon);
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        Date oldTgllahir = this.tgllahir;
        this.tgllahir = tgllahir;
        changeSupport.firePropertyChange("tgllahir", oldTgllahir, tgllahir);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpelanggan != null ? idpelanggan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPelanggan)) {
            return false;
        }
        TblPelanggan other = (TblPelanggan) object;
        if ((this.idpelanggan == null && other.idpelanggan != null) || (this.idpelanggan != null && !this.idpelanggan.equals(other.idpelanggan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "penjualanalatmusik.TblPelanggan[ idpelanggan=" + idpelanggan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

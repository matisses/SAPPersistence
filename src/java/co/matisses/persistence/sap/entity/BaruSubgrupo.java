package co.matisses.persistence.sap.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author dbotero
 */
@Entity
@Table(name = "[@BARU_SUBGRUPO]")
@NamedQueries({
    @NamedQuery(name = "BaruSubgrupo.findAll", query = "SELECT b FROM BaruSubgrupo b")})
public class BaruSubgrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Name")
    private String name;
    @Size(max = 20)
    @Column(name = "U_Cod_Grupo")
    private String uCodGrupo;
    @Size(max = 100)
    @Column(name = "U_Nom_Grupo")
    private String uNomGrupo;
    @Size(max = 50)
    @Column(name = "U_url_title")
    private String uurltitle;
    @Size(max = 1073741823)
    @Column(name = "U_metadescription")
    private String umetadescription;
    @Column(name = "U_WEB")
    private Short uWeb;
    @Size(max = 30)
    @Column(name = "U_descripcion")
    private String udescripcion;
    @Column(name = "U_Categoria_ML")
    private String ucategoriaML;

    public BaruSubgrupo() {
    }

    public BaruSubgrupo(String code) {
        this.code = code;
    }

    public BaruSubgrupo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUCodGrupo() {
        return uCodGrupo;
    }

    public void setUCodGrupo(String uCodGrupo) {
        this.uCodGrupo = uCodGrupo;
    }

    public String getUNomGrupo() {
        return uNomGrupo;
    }

    public void setUNomGrupo(String uNomGrupo) {
        this.uNomGrupo = uNomGrupo;
    }

    public String getUurltitle() {
        return uurltitle;
    }

    public void setUurltitle(String uurltitle) {
        this.uurltitle = uurltitle;
    }

    public String getUmetadescription() {
        return umetadescription;
    }

    public void setUmetadescription(String umetadescription) {
        this.umetadescription = umetadescription;
    }

    public Short getUWeb() {
        return uWeb;
    }

    public void setUWeb(Short uWeb) {
        this.uWeb = uWeb;
    }

    public String getUdescripcion() {
        return udescripcion;
    }

    public void setUdescripcion(String udescripcion) {
        this.udescripcion = udescripcion;
    }

    public String getUcategoriaML() {
        return ucategoriaML;
    }

    public void setUcategoriaML(String ucategoriaML) {
        this.ucategoriaML = ucategoriaML;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaruSubgrupo)) {
            return false;
        }
        BaruSubgrupo other = (BaruSubgrupo) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.matisses.persistence.sap.entity.BaruSubgrupo[ code=" + code + " ]";
    }

}

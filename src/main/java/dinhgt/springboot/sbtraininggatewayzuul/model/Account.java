package dinhgt.springboot.sbtraininggatewayzuul.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "account", schema = "my_schema")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 36, nullable = false, updatable = false)
	private int id;
	
	@Column(name = "username")
	private String username;

	@Column(name = "password", nullable = false)
	@NonNull
	private String password;

	@Column(name = "first_name", length = 65)
	@NonNull
	private String firtName;

	@Column(name = "last_name", length = 65)
	@NonNull
	private String lastName;

	@Column(name = "email")
	@NonNull
	private String email;

	@Column(name = "phone", length = 10)
	@NonNull
	private String phone;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "update_date")
	private LocalDateTime updateDate;

	@Column(name = "device_token")
	private String deviceToken;
	
	@Column(name = "is_actived")
	private boolean isActived;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_account", referencedColumnName = "role_id")
	private Role roles;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, String password, String firtName, String lastName, String email, String phone,
			LocalDateTime createdDate, LocalDateTime updateDate, String deviceToken, boolean isActived,
			Role roles) {
		super();
		this.id = id;
		this.password = password;
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
		this.deviceToken = deviceToken;
		this.isActived = isActived;
		this.roles = roles;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firtName
	 */
	public String getFirtName() {
		return firtName;
	}

	/**
	 * @param firtName the firtName to set
	 */
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updateDate
	 */
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the deviceToken
	 */
	public String getDeviceToken() {
		return deviceToken;
	}

	/**
	 * @param deviceToken the deviceToken to set
	 */
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	/**
	 * @return the roles
	 */
	public Role getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Role roles) {
		this.roles = roles;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", firtName=" + firtName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", createdDate=" + createdDate + ", updateDate="
				+ updateDate + ", deviceToken=" + deviceToken + ", roles=" + roles + "]";
	}

	/**
	 * @return the isActived
	 */
	public boolean isActived() {
		return isActived;
	}

	/**
	 * @param isActived the isActived to set
	 */
	public void setActived(boolean isActived) {
		this.isActived = isActived;
	}
	
	

	

}

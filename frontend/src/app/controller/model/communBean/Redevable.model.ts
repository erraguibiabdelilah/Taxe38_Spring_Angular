import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class RedevableDto extends BaseDto{

    public email: string;

    public password: string;

    public cin: string;

    public nom: string;

    public prenom: string;

   public credentialsNonExpired: null | boolean;

   public enabled: null | boolean;

   public accountNonExpired: null | boolean;

   public accountNonLocked: null | boolean;

   public passwordChanged: null | boolean;

    public username: string;

    public password: string;

    

    constructor() {
        super();

        this.email = '';
        this.password = '';
        this.cin = '';
        this.nom = '';
        this.prenom = '';
        this.credentialsNonExpired = null;
        this.enabled = null;
        this.accountNonExpired = null;
        this.accountNonLocked = null;
        this.passwordChanged = null;
        this.username = '';
        this.password = '';

        }

}

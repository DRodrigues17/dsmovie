import{ ReactComponent as StarFull} from 'assets/img/star.svg';
import{ ReactComponent as StarHalf} from 'assets/img/star-half.svg';
import{ ReactComponent as StarEmpty} from 'assets/img/star-hollow.svg';
import'./style.css';

function MonvieStars(){
    return(
        <div className="dsmovie-stars-container">
  <StarFull/>
  <StarFull/>
  <StarFull/>
  <StarHalf/>
  <StarEmpty/>
</div>
    );
}

export default MonvieStars;
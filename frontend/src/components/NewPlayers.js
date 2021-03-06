import React, { useState } from "react";

import Request from "../helpers/Request"
import Popup from 'reactjs-popup';
import './Modal.css'


const NewPlayers = ({getAllPlayers}) => {

    const [statePlayer, setStatePlayer] = useState(
        {
            name: ""
        }
    )

    const handlePlayerName = (event) => {
        let propertyName = event.target.name;
        let copiedPlayer = {...statePlayer}
        copiedPlayer[propertyName] = event.target.value;
        setStatePlayer(copiedPlayer);
    }
    
    const createPlayer = (event) => {
        event.preventDefault()
        const request = new Request()
        request.post("api/players", statePlayer)
        .then(() => getAllPlayers())
        setStatePlayer({
            name: ""
        })
    }

    return(
        <>
        <h1>Manage Players</h1>
        <form onSubmit={createPlayer} class="new-player-form">
        <label>Player Name: </label>
        <input onChange={handlePlayerName} type="text" name="name" className="input" value={statePlayer.name}></input>
        <Popup
    trigger={
        <button type="submit" className="button" >Add Player</button>
    }
    modal
    nested
  >
       {close => (
      <div className="modal">
       
        <div className="header" onClick={close}> New Player was added to the game database 🏆</div>
        <div className="content" onClick={close}>
          {' '}
          You can add him to your season 🚀
        </div>
        
      </div>
    )}
  </Popup>
        </form>
        </>
    )
}

export default NewPlayers


